package com.example.service;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.domain.PaymentInfo;
import com.example.domain.PaymentInfoDB;
import com.example.domain.QueryInfo;
import com.example.domain.QueryInfoDB;

@Service
public class ConvertObjectService {
	
	private static final String format =  "yyyy/MM/dd";
	
	@Autowired
	GetItemListService getItemListService;
	
	public QueryInfoDB convertToQueryDB(QueryInfo queryInfo) throws ParseException {
		
		System.out.println("start convertToQueryDB QueryInfo=" + queryInfo);

		java.sql.Date payDate = null;
		if (queryInfo.getPayDate() != null ) {
			// Stringからjava.util.Dateに変換
			DateFormat foramt = new SimpleDateFormat(format);
			Date date = foramt.parse(queryInfo.getPayDate());
			
			// java.util.Dateをjava.sql.Dateに変換
			payDate = new java.sql.Date(date.getTime());
		}

		// DBパラメータ用のQueryInfoDBを生成し返却
		QueryInfoDB queryInfoDB = new QueryInfoDB(payDate, queryInfo.getItemId());
		
		System.out.println("end convertToQueryDB QueryInfoDB=" + queryInfoDB);
		return queryInfoDB;
	}
	
	public List<PaymentInfo>  convertToPayJL(List<PaymentInfoDB>  payInfoDBList) {
		
		System.out.println("start convertToPayJL List<PaymentInfoDB>=" + payInfoDBList);
		
		List<PaymentInfo> payInfoList = new ArrayList<PaymentInfo>();
		
		payInfoDBList.stream()
					 .forEach(paymentInfoDB -> 
					 	payInfoList.add(convertToPayJson(paymentInfoDB)));
		
		System.out.println("end convertToPayJL List<PaymentInfo>=" + payInfoList);
		return payInfoList;
	}
	
	public PaymentInfo convertToPayJson(PaymentInfoDB paymentInfoDB) {
		
		System.out.println("start convertToPayJson PaymentInfoDB=" + paymentInfoDB);
		
		Integer itemId = paymentInfoDB.getItemId();
		
		PaymentInfo paymentInfo = new PaymentInfo(new SimpleDateFormat(format).format(paymentInfoDB.getPayDate()), 
												itemId,
												convertItemName(itemId),
												paymentInfoDB.getUnitPrice().intValue(),
												paymentInfoDB.getQuantity(),
												paymentInfoDB.getAmount().intValue()); 
		
		System.out.println("end convertToPayJson PaymentInfo=" + paymentInfo);
		return paymentInfo;
	}
	
	public String convertItemName(Integer itemId) {
		
		System.out.println("start convertItemName ItemId=" + itemId);
		
		String result = "";

		System.out.println("start getItemListService,selectAll");
		List<Item> itemList = getItemListService.selectAll();
		System.out.println("end getItemListService,selectAll ItemList=" + itemList);
		
		for (Item item:itemList) {
			if (item.getItemId().equals(itemId)) {
				result = item.getName();
				break;
			}
		}
		
		System.out.println("end convertItemName name=" + result);
		return result;
	}
}

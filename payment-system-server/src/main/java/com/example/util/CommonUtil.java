package com.example.util;

import java.util.ArrayList;
import java.util.Date;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.example.domain.ExtendedPayment;
import com.example.domain.Payment;
import com.example.dto.PaymentDto;
import com.example.dto.SearchConditionsDto;
import com.example.domain.SearchConditionsDtoDb;

/**
 * ユーティリティクラス
 * @author YutaKoga
 */
public class CommonUtil {
	
	// 日付変換用フォーマット
	private static final String format =  "yyyy/MM/dd";
	
	/**
	 * 検索条件クラス(SQL用)生成処理
	 * <br>
	 * [説明]検索条件DTOクラスから検索条件クラス(SQL用)を生成します。
	 * @param 検索条件DTOクラス
	 * @return 検索条件クラス(SQL用)
	 */
	public static SearchConditionsDtoDb createSCSql(SearchConditionsDto searchConditions) throws ParseException {
		
		System.out.println("start createSCSql SearchConditionsDto=" + searchConditions);

		java.sql.Date payDate = null;
		if (searchConditions.getPayDate() != null ) {
			
			// 検索条件DTOクラスの日付が設定有りの場合、文字列>DATE変換処理を行う。
			payDate = convertToDateFromStr(searchConditions.getPayDate());
		}

		// 返却値:検索条件クラス(SQL用)
		SearchConditionsDtoDb queryInfoDB = new SearchConditionsDtoDb(payDate, searchConditions.getItemId());
		
		System.out.println("end createSCSql SearchConditionsDto=" + queryInfoDB);
		return queryInfoDB;
	}
	
	/**
	 * 文字列>DATE変換処理
	 * <br>
	 * [説明]文字列からjava.sql.Dateへの変換を行います。
	 * @param String
	 * @return java.sql.Date
	 */
	public static java.sql.Date convertToDateFromStr(String payDate) throws ParseException {
		
		System.out.println("start convertToDateFromStr String=" + payDate);
		
		// Stringからjava.util.Dateへの変換
		DateFormat foramt = new SimpleDateFormat(format);
		Date date = foramt.parse(payDate);
					
		// java.util.Dateからjava.sql.Dateへの変換�
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		System.out.println("start convertToDateFromStr Date=" + sqlDate);
		return sqlDate;
	}
	
	/**
	 * 支払情報DTOリスト生成処理
	 * <br>
	 * [説明]支払情報Entity（拡張版）リストから支払情報DTOリストを生成します。
	 * @param 支払情報Entity（拡張版）リスト
	 * @return 支払情報DTOリスト
	 */
	public static List<PaymentDto>  createPaymentDtoList(List<ExtendedPayment>  paymentList) {
		
		System.out.println("start createPaymentDtoList List<ExtendedPayment>=" + paymentList);
		
		// 返却値：支払情報DTOリスト
		List<PaymentDto> paymentDtoList = new ArrayList<PaymentDto>();
		
		// 支払情報Entity（拡張版）リスト分支払情報DTOクラス生成処理を行う
		paymentList.stream()
					 .forEach(payment -> 
					 paymentDtoList.add(createPaymentDto(payment)));
		
		System.out.println("end createPaymentDtoList List<PaymentDto>=" + paymentDtoList);
		return paymentDtoList;
	}
	
	/**
	 * 支払情報DTOクラス生成処理
	 * <br>
	 * [説明]支払情報Entity（拡張版）クラスから支払情報DTOクラスを生成します。
	 * @param 支払情報Entity（拡張版）クラス
	 * @return 支払情報DTOクラス
	 */
	public static PaymentDto createPaymentDto(ExtendedPayment payment) {
		
		System.out.println("start createPaymentDto ExtendedPayment=" + payment);
		
		// 支払情報DTOクラスの生成
		PaymentDto paymentDto = new PaymentDto(new SimpleDateFormat(format).format(payment.getPayDate()), 
												payment.getItemId(),
												payment.getName(),
												payment.getUnitPrice().intValue(),
												payment.getQuantity(),
												payment.getAmount().intValue()); 
		
		System.out.println("end createPaymentDto PaymentDto=" + paymentDto);
		return paymentDto;
	}
	
	/**
	 * 支払情報DTOリスト生成処理
	 * <br>
	 * [説明]支払情報DTOクラスから支払情報Entityクラスを生成します。
	 * @param 支払情報DTOクラス
	 * @return 支払情報Entityクラス
	 */
	public static Payment createPayment(PaymentDto paymentDto) throws ParseException {
		
		System.out.println("start createPayment PaymentDto=" + paymentDto);
		
		java.sql.Date payDate = null;
		if (paymentDto.getPayDate() != null ) {
			
			// 支払情報DTOクラスの日付が設定有りの場合、文字列>DATE変換処理を行う。
			payDate = convertToDateFromStr(paymentDto.getPayDate());
		}

		// 支払情報Entityクラスの生成
		Payment payment = new Payment(null, 
									payDate,
									paymentDto.getItemId(),
									BigDecimal.valueOf(paymentDto.getUnitPrice()),
									paymentDto.getQuantity(),
									BigDecimal.valueOf(paymentDto.getAmount())); 
		
		System.out.println("end createPayment payment=" + payment);
		return payment;
	}
}

package com.example.api;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.PaymentInfo;
import com.example.domain.PaymentInfoList;
import com.example.domain.QueryInfo;
import com.example.service.PaymentListService;

/**
 * 購入履歴一覧表示Restコントローラクラス
 * @author YutaKoga
 * @version 1.0
 */
@RestController
@RequestMapping("api/paymentList/")
public class PaymentListRestController {
	
	@Autowired
	PaymentListService paymentListService;

	/**
	 * 購入履歴一覧表示API
	 * @param クエリ情報エンティティクラス
	 * @return 購入履歴一覧エンティティクラス
	 * @throws ParseException 
	 */
	@PostMapping
	PaymentInfoList getPaymentList(@RequestBody QueryInfo queryInfo ) throws ParseException {
		
		System.out.println("call paymentList");
		System.out.println(queryInfo);
		
		List<PaymentInfo> paymentInfoList = paymentListService.findByQueryInfo(queryInfo);
		
		System.out.println("end paymentList");
		System.out.println(paymentInfoList);
		
		PaymentInfoList payInfoListJson = new PaymentInfoList(paymentInfoList);
		
		return payInfoListJson;
	}
}

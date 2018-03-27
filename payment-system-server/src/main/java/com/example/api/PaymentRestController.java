package com.example.api;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;
import com.example.domain.PaymentInfo;
import com.example.domain.QueryInfo;

/**
 * 支払画面Restコントローラクラス
 * @author YutaKoga
 * @version 1.0
 */
@RestController
@RequestMapping("api/payment/")
public class PaymentRestController {

	
//	/**
//	 * 購入履歴一覧表示API
//	 * @param クエリ情報エンティティクラス
//	 * @return 支払情報リスト
//	 */
//	@PostMapping(path = "paymentList")
//	List<PaymentInfo> getPaymentList(@RequestBody QueryInfo queriesInfo ) {
//		
//		System.out.println("call paymentList");
//		System.out.println(queriesInfo);
//		
//		List<PaymentInfo> paymentInfoList = ;
//		
//		System.out.println("end paymentList");
//		System.out.println(paymentInfoList);
//		return paymentInfoList;
//	}
//	
//	/**
//	 * 支払詳細API
//	 * @param 支払情報エンティティクラス
//	 */
//	@PostMapping(path = "paymentDetail")
//	void postPaymentDetail(@RequestBody PaymentInfo paymentInfo ) {
//		
//		System.out.println("call paymentDetail");
//		System.out.println(paymentInfo);
//		
//		List<PaymentInfo> paymentInfoList = ;
//		
//		System.out.println("end paymentDetail");
//		return;
//	}
}

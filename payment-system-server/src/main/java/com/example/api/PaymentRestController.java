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
 * �x�����Rest�R���g���[���N���X
 * @author YutaKoga
 * @version 1.0
 */
@RestController
@RequestMapping("api/payment/")
public class PaymentRestController {

	
//	/**
//	 * �w�������ꗗ�\��API
//	 * @param �N�G�����G���e�B�e�B�N���X
//	 * @return �x����񃊃X�g
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
//	 * �x���ڍ�API
//	 * @param �x�����G���e�B�e�B�N���X
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

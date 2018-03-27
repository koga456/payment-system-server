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
 * �w�������ꗗ�\��Rest�R���g���[���N���X
 * @author YutaKoga
 * @version 1.0
 */
@RestController
@RequestMapping("api/paymentList/")
public class PaymentListRestController {
	
	@Autowired
	PaymentListService paymentListService;

	/**
	 * �w�������ꗗ�\��API
	 * @param �N�G�����G���e�B�e�B�N���X
	 * @return �w�������ꗗ�G���e�B�e�B�N���X
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

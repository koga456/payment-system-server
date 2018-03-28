package com.example.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.PaymentDto;
import com.example.repository.PaymentRepository;
import com.example.util.CommonUtil;

/**
 * 支払詳細サービスクラス
 * @author YutaKoga
 */
@Service
public class PaymentDetailService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	/**
	 * 支払情報挿入メソッド
	 * @param 支払情報DTOクラス
	 */
	public void insertPayment(PaymentDto payment) throws ParseException {
		
		paymentRepository.insertPayment(CommonUtil.createPayment(payment));
	}
}

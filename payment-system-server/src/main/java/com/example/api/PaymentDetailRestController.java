package com.example.api;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PaymentDto;
import com.example.service.PaymentDetailService;

/**
 * 支払詳細RESTコントローラクラス
 * @author YutaKoga
 */
@RestController
@RequestMapping("api/paymentDetail/")
public class PaymentDetailRestController {
	
	@Autowired
	PaymentDetailService paymentDetailService;

	/**
	 * 支払詳細API
	 * <br>
	 * [説明]呼出パラメータをもとに購入履歴一覧テーブルに購入履歴を挿入する。
	 * @param 支払情報DTOクラス
	 * @throws ParseException 
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin
	public void insertPayment(@RequestBody PaymentDto payment ) throws ParseException {
		
		System.out.println("call insertPayment");
		System.out.println(payment);
		
		// 支払詳細Serviceの呼び出し
		paymentDetailService.insertPayment(payment);
		
		System.out.println("end insertPayment");
	}
}

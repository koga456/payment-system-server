package com.example.api;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PaymentDto;
import com.example.dto.PaymentInfoListDto;
import com.example.dto.SearchConditionsDto;
import com.example.service.PaymentListService;

/**
 * 購入履歴一覧表示RESTコントローラクラス
 * @author YutaKoga
 */
@RestController
@RequestMapping("api/paymentList/")
public class PaymentListRestController {
	
	@Autowired
	PaymentListService paymentListService;

	/**
	 * 購入履歴一覧表示API
	 * <br>
	 * [説明]呼出パラメータをもとに購入履歴一覧テーブルにSQLを発行し、検索結果をjson形式で返却する。
	 * @param 検索情報DTOクラス
	 * @return 購入履歴一覧DTOクラス
	 * @throws ParseException 
	 */
	@PostMapping
	@CrossOrigin
	public PaymentInfoListDto getPaymentList(@RequestBody SearchConditionsDto searchConditions ) throws ParseException {
		
		System.out.println("call paymentList");
		System.out.println(searchConditions);
		
		// 購入履歴一覧表示Serviceの呼び出し
		List<PaymentDto> paymentInfoList = paymentListService.getPayment(searchConditions);
		
		System.out.println("end paymentList");
		System.out.println(paymentInfoList);
		
		// 返却値：購入履歴一覧DTOクラス
		PaymentInfoListDto payInfoListJson = new PaymentInfoListDto(paymentInfoList);
		
		return payInfoListJson;
	}
}

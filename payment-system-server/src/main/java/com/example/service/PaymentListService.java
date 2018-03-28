package com.example.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.PaymentDto;
import com.example.dto.SearchConditionsDto;
import com.example.repository.PaymentRepository;
import com.example.util.CommonUtil;

/**
 * 購入履歴一覧表示サービスクラス
 * @author YutaKoga
 */
@Service
public class PaymentListService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	/**
	 * 支払情報取得メソッド
	 * @param 検索条件DTOクラス
	 * @return 支払情報DTOリスト
	 */
	public List<PaymentDto> getPayment(SearchConditionsDto searchConditions) throws ParseException {
		
		return CommonUtil
				.createPaymentDtoList(
						paymentRepository
						.getPayment(
								CommonUtil
								.createSCSql(searchConditions)));
	}
}

package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.ExtendedPayment;
import com.example.domain.Payment;
import com.example.domain.mapper.PaymentMapper;
import com.example.domain.SearchConditionsDtoDb;

/**
 * 購入履歴一覧リポジトリクラス
 * @author YutaKoga
 */
@Repository
@Transactional
public class PaymentRepository {

	@Autowired
	PaymentMapper paymentMapper;
	
	/**
	 * 支払情報取得メソッド
	 * @param 検索条件クラス(SQL用)
	 * @return 支払情報Entity（拡張版）リスト
	 */
	public List<ExtendedPayment> getPayment(SearchConditionsDtoDb searchConditions) {
		return paymentMapper.getPayment(searchConditions);
	}
	
	/**
	 * 支払情報挿入メソッド
	 * @param 支払情報Entity
	 */
	public void insertPayment(Payment payment) {
		paymentMapper.insertPayment(payment);
	}
}

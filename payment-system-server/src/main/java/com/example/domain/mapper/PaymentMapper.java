package com.example.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.domain.ExtendedPayment;
import com.example.domain.Payment;
import com.example.domain.SearchConditionsDtoDb;

/**
 * 購入履歴一覧マッパーインタフェース
 * @author YutaKoga
 */
public interface PaymentMapper {

	/**
	 * 支払情報取得メソッド
	 * @param 検索条件クラス(SQL用)
	 * @return 支払情報Entity（拡張版）リスト
	 */
	List<ExtendedPayment> getPayment(
			@Param ("searchConditions") SearchConditionsDtoDb searchConditions
			);
	
	/**
	 * 支払情報挿入メソッド
	 * @param 支払情報Entity
	 */
	void insertPayment(
			@Param ("payment") Payment payment
			);
}

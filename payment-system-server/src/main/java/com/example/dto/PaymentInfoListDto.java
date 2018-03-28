package com.example.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 購入履歴一覧DTOクラス
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfoListDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 購入履歴一覧リスト
	List<PaymentDto> paymentInfoList;
}

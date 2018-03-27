package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 支払情報エンティティクラス
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class PaymentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 日付
	private String payDate;
	// 品目ID
	private int itemId;
	// 品目名
	private String name;
	// 単価
	private int unitPrice;
	// 数量
	private int quantity;
	// 金額
	private int amount;
}

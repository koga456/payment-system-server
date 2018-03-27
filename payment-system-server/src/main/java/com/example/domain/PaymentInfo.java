package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支払情報エンティティクラス
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 日付
	private String payDate;
	// 品目ID
	private Integer itemId;
	// 品目名
	private String name;
	// 単価
	private Integer unitPrice;
	// 数量
	private Integer quantity;
	// 金額
	private Integer amount;
	
	@Override
	public String toString() {
		return "日付:" + payDate +
		       ", 品目ID:" + itemId +
		       ", 品目名:" + name +
	           ", 単価:" + unitPrice +
		       ", 数量:" + quantity +
		       ", 金額:" + amount;
	}
}

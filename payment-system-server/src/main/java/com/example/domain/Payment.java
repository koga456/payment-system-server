package com.example.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支払情報Entityクラス
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ID
	private Integer id;
	// 日付
	private Date payDate;
	// 品目ID
	private Integer itemId;
	// 単価
	private BigDecimal unitPrice;
	// 数量
	private Integer quantity;
	// 金額
	private BigDecimal amount;
	
	@Override
	public String toString() {
		return "ID:" + id +
		       ", 日付:" + payDate +
		       ", 品目ID:" + itemId +
	           ", 単価:" + unitPrice +
		       ", 数量:" + quantity +
		       ", 金額:" + amount;
	}
}

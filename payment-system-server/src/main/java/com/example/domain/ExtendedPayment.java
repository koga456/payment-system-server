package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 支払情報Entityクラス(拡張版)
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class ExtendedPayment extends Payment {

	private static final long serialVersionUID = 1L;
	
	// 品目名
	private String name;
	
	@Override
	public String toString() {
		return  super.toString() + ", 品目名:" + name; 
	}
}

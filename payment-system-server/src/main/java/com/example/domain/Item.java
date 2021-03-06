package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 品目情報Entityクラス
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 品目ID
	private Integer itemId;
	// 品目名
	private String name;
	
	@Override
	public String toString() {
		return "品目ID:" + itemId +  ", 品目名:" + name;
	}
}

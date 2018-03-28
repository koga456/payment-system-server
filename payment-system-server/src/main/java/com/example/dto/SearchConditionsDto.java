package com.example.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 検索条件DTOクラス
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchConditionsDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 日付
	private String payDate;
	// 品目ID
	private Integer itemId;

	@Override
	public String toString() {
		return "日付:" + payDate +  ", 品目ID:" + itemId;
	}
}

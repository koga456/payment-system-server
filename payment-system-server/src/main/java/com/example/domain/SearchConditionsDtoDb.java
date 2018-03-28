package com.example.domain;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 検索条件クラス(SQL用)
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchConditionsDtoDb implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 日付
	private Date payDate;
	// 品目ID
	private Integer itemId;

	@Override
	public String toString() {
		return "日付:" + payDate +  ", 品目ID:" + itemId;
	}
}

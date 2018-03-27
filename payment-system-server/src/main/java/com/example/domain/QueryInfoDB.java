package com.example.domain;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * クエリ情報エンティティクラス(DBパラメータ用)
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryInfoDB implements Serializable {

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

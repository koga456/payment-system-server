package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * クエリ情報エンティティクラス
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class QueryInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 日付
	private String payDate;
	// 品目ID
	private int itemId;
}

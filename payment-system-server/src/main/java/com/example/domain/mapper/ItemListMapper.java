package com.example.domain.mapper;

import java.util.List;

import com.example.domain.Item;

/**
 * 品目一覧マスタマッパーインタフェース
 * @author YutaKoga
 */
public interface ItemListMapper {

	/**
	 * 品目一覧取得メソッド
	 * @return 品目Entityリスト
	 */
	List<Item> selectAll();
}

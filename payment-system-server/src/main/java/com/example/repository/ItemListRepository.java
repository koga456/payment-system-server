package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Item;
import com.example.domain.mapper.ItemListMapper;

/**
 * 品目一覧マスタリポジトリクラス
 * @author YutaKoga
 */
@Repository
@Transactional
public class ItemListRepository {

	@Autowired
	ItemListMapper itemListMapper;
	
	/**
	 * 品目一覧取得メソッド
	 * @return 品目Entityリスト
	 */
	public List<Item> selectAll() {
		return itemListMapper.selectAll();
	}
}

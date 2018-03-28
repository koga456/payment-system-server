package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemListRepository;

/**
 * 品目一覧取得サービスクラス
 * @author YutaKoga
 */
@Service
public class GetItemListService {

	@Autowired
	ItemListRepository itemListRepository;
	
	/**
	 * 品目一覧取得メソッド
	 * @return 品目Entityリスト
	 */
	public List<Item> selectAll() {
		return itemListRepository.selectAll();
	}
}

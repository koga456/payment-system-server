package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Item;
import com.example.domain.mapper.ItemListMapper;

@Repository
@Transactional
public class ItemListRepository {

	@Autowired
	ItemListMapper itemListMapper;
	
	public List<Item> selectAll() {
		return itemListMapper.selectAll();
	}
}

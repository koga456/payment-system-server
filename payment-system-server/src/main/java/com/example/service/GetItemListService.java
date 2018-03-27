package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemListRepository;

@Service
public class GetItemListService {

	@Autowired
	ItemListRepository itemListRepository;
	
	public List<Item> selectAll() {
		return itemListRepository.selectAll();
	}
}

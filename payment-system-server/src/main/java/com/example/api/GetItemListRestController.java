package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;
import com.example.domain.ItemList;
import com.example.service.GetItemListService;

/**
 * �i�ڈꗗ�擾Rest�R���g���[���N���X
 * @author YutaKoga
 * @version 1.0
 */
@RestController
@RequestMapping("api/getItemList")
public class GetItemListRestController {
	
	@Autowired
	GetItemListService getItemListService;
	
	/**
	 * �i�ڈꗗ�擾API
	 * @return �i�ڏ�񃊃X�g
	 */
	@PostMapping
	public ItemList getItemList() {
		
		System.out.println("call getItemList");
		
		List<Item> itemList = getItemListService.selectAll();
		
		System.out.println("end getItemList");
		System.out.println(itemList);
		
		ItemList itemListJson = new ItemList(itemList);
		
		return itemListJson;
	}

}

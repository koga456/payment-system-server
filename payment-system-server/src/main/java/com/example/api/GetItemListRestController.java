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
 * 品目一覧取得Restコントローラクラス
 * @author YutaKoga
 * @version 1.0
 */
@RestController
@RequestMapping("api/getItemList")
public class GetItemListRestController {
	
	@Autowired
	GetItemListService getItemListService;
	
	/**
	 * 品目一覧取得API
	 * @return 品目情報リスト
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

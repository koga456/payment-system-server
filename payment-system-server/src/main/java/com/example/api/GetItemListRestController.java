package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;
import com.example.dto.ItemListDto;
import com.example.service.GetItemListService;

/**
 * 品目一覧取得RESTコントローラクラス
 * @author YutaKoga
 */
@RestController
@RequestMapping("api/getItemList")
public class GetItemListRestController {
	
	@Autowired
	GetItemListService getItemListService;
	
	/**
	 * 品目一覧取得API
	 * <br>
	 * [説明]品目一覧を返却する。
	 * @return 品目一覧DTOクラス
	 */
	@PostMapping
	@CrossOrigin
	public ItemListDto getItemList() {
		
		System.out.println("call getItemList");
		
		// 品目一覧取得Serviceの呼び出し
		List<Item> itemList = getItemListService.selectAll();
		
		System.out.println("end getItemList");
		System.out.println(itemList);
		
		// 返却値：購入履歴一覧DTOクラス
		ItemListDto itemListJson = new ItemListDto(itemList);
		
		return itemListJson;
	}

}

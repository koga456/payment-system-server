package com.example.dto;

import java.io.Serializable;
import java.util.List;

import com.example.domain.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 品目一覧DTOクラス
 * @author YutaKoga
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemListDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// 品目一覧リスト
	List<Item> itemlist;
}

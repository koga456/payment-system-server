package com.example.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * �i�ڈꗗ�G���e�B�e�B�N���X
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	List<Item> itemlist;
}

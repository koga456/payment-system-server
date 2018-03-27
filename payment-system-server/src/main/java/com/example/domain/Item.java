package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * �i�ڃG���e�B�e�B�N���X
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// �i��ID
	private Integer itemId;
	// �i�ږ�
	private String name;
	
	@Override
	public String toString() {
		return "�i��ID:" + itemId +  ", �i�ږ�:" + name;
	}
}

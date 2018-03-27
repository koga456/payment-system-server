package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * �N�G�����G���e�B�e�B�N���X
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ���t
	private String payDate;
	// �i��ID
	private Integer itemId;

	@Override
	public String toString() {
		return "���t:" + payDate +  ", �i��ID:" + itemId;
	}
}

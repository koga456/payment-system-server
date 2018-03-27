package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * �x�����G���e�B�e�B�N���X
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class PaymentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ���t
	private String payDate;
	// �i��ID
	private int itemId;
	// �i�ږ�
	private String name;
	// �P��
	private int unitPrice;
	// ����
	private int quantity;
	// ���z
	private int amount;
}

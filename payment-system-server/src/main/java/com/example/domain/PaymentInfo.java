package com.example.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * �x�����G���e�B�e�B�N���X
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ���t
	private String payDate;
	// �i��ID
	private Integer itemId;
	// �i�ږ�
	private String name;
	// �P��
	private Integer unitPrice;
	// ����
	private Integer quantity;
	// ���z
	private Integer amount;
	
	@Override
	public String toString() {
		return "���t:" + payDate +
		       ", �i��ID:" + itemId +
		       ", �i�ږ�:" + name +
	           ", �P��:" + unitPrice +
		       ", ����:" + quantity +
		       ", ���z:" + amount;
	}
}

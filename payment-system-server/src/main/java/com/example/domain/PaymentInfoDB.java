package com.example.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * �x�����G���e�B�e�B�N���X(DB�ԋp�l�p)
 * @author YutaKoga
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfoDB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// ID
	private Integer id;
	// ���t
	private Date payDate;
	// �i��ID
	private Integer itemId;
	// �P��
	private BigDecimal unitPrice;
	// ����
	private Integer quantity;
	// ���z
	private BigDecimal amount;
	
	@Override
	public String toString() {
		return "ID:" + id +
		       ", ���t:" + payDate +
		       ", �i��ID:" + itemId +
	           ", �P��:" + unitPrice +
		       ", ����:" + quantity +
		       ", ���z:" + amount;
	}
}

package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.PaymentInfoDB;
import com.example.domain.QueryInfoDB;
import com.example.domain.mapper.PaymentMapper;

@Repository
@Transactional
public class PaymentRepository {

	@Autowired
	PaymentMapper paymentMapper;
	
	public List<PaymentInfoDB> findByQueryInfo(QueryInfoDB queryInfoDB) {
		return paymentMapper.findByQueryInfo(queryInfoDB);
	}
}

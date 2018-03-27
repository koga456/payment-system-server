package com.example.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.PaymentInfo;
import com.example.domain.QueryInfo;
import com.example.repository.PaymentRepository;

@Service
public class PaymentListService {
	
	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	ConvertObjectService convertObjectService;
	
	public List<PaymentInfo> findByQueryInfo(QueryInfo queryInfo) throws ParseException {
		
		return convertObjectService
				.convertToPayJL(
						paymentRepository
						.findByQueryInfo(
								convertObjectService
								.convertToQueryDB(queryInfo)));
	}
}

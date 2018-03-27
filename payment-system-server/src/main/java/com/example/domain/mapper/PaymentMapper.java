package com.example.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.domain.PaymentInfoDB;
import com.example.domain.QueryInfoDB;

public interface PaymentMapper {

	List<PaymentInfoDB> findByQueryInfo(
			@Param ("queryInfo") QueryInfoDB queryInfo
			);
}

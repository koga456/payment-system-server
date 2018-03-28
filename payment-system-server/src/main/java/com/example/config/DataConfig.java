package com.example.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * DataConfigクラス
 * @author YutaKoga
 */
@Configuration
@ComponentScan("com.example.domain")
@EnableTransactionManagement
@MapperScan("com.example.domain.mapper")
public class DataConfig {
	
	/**
	 * トランザクションの設定
	 * @param DataSource
	 * @return PlatformTransactionManager
	 */
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
	/**
	 * mybatis定義ファイルの設定
	 * @param DataSource
	 * @return SqlSessionFactoryBean
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));
		return sessionFactoryBean;
	}
}

package com.BjpTracking.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AppDao {
	
	@Autowired
	DataSource dataSource; 
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		 return  new JdbcTemplate(dataSource); 		
	}


}

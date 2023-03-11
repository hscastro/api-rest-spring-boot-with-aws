package com.hscastro.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hscastro.rest.services.DBService;
	

@Profile("test")
@Configuration
public class ConfigProfile {

	@Autowired
	private DBService dbTest;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddl;
	
	@Bean
	public boolean configDBTest() {
		this.dbTest.instanceDB();
		
		if(ddl.equals("true")) {
			this.dbTest.instanceDB();
		}
		return false;
	}	
}
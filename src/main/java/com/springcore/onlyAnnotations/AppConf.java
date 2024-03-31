package com.springcore.onlyAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.onlyAnnotations")
public class AppConf {
	@Autowired
	@Qualifier("getStudent")
	Student student;
	
	@Bean("address")
	public Address getAddesss() {
		return new Address(student);
	}

}

package com.springcore.amb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculate {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/amb/ambConf.xml");
		Addition add = (Addition) context.getBean("Addition1");
		add.add();
	}
}

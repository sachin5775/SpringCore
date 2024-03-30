package com.springcore.steriotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSterio {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/steriotype/steConf.xml");

		Student std = context.getBean("std", Student.class);
		System.out.println(std);
	}
}

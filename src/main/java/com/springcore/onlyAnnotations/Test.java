package com.springcore.onlyAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
		// The way with @componant
		Student std = context.getBean("getStudent", Student.class);
		System.out.println(std);
		// The way with @bean
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
	}

}

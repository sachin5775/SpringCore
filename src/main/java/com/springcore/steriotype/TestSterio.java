package com.springcore.steriotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSterio {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/steriotype/steConf.xml");

		Student std = context.getBean("std", Student.class);
		Student std2 = context.getBean("std1", Student.class);
		std.setStudentId(1);
		//std2.setStudentId(2);
		System.out.println(std);
		System.out.println(std2);
		System.out.println(std.hashCode());
		System.out.println(std2.hashCode());
	}
}

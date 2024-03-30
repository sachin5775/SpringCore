package com.springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciConf.xml");
		Person person = (Person) context.getBean("Person1");
		System.out.println(person);
	}
}

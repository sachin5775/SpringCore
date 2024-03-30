package com.springcore.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowired/wiredConf.xml");
	Employee emp = (Employee) context.getBean("Emp1");
	System.out.println(emp);
}
}

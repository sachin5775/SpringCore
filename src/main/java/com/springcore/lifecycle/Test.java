package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeConf.xml");
	context.registerShutdownHook();
	Samosa samosa1 = (Samosa) context.getBean("Samosa1");
	System.out.println(samosa1);
	
	System.out.println("=======================================");
	Pepsi pepsi1 = (Pepsi) context.getBean("Pepsi1");
	System.out.println(pepsi1);
	System.out.println("=======================================");
	Kachori kachori1 = (Kachori) context.getBean("Kachori1");
	System.out.println(kachori1);
	
}
}

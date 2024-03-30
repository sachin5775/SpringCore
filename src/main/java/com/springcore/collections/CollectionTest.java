package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collectionConfig.xml");
		Emp emp1 = (Emp) context.getBean("Emp1");
		System.out.println(emp1);
		System.out.println(emp1.getEmpCitys().getClass().getName());
	}
}

package com.springcore.collections.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml",
				"com/springcore/collections/standalone/collectionConfig.xml");
		Emp emp1 = (Emp) context.getBean("Emp1");
		Emp emp2 = (Emp) context.getBean("emp2");
		System.out.println(emp1);
		System.out.println(emp1.getEmpCitys().getClass().getName());
		System.out.println(emp1.getCources().getClass().getName());
		System.out.println(emp1.getEmpOccupations().getClass().getName());
		System.out.println(emp1.getProperties().getClass().getName());

		System.out.println("==========================================");
		System.out.println(emp2);
		System.out.println(emp2.getEmpCitys().getClass().getName());
		System.out.println(emp2.getCources().getClass().getName());
		System.out.println(emp2.getEmpOccupations().getClass().getName());
		System.out.println(emp2.getProperties().getClass().getName());
		System.out.println(emp2.getStudent().getStudentId());
	}
}

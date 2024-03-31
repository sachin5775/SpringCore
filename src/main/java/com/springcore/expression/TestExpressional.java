package com.springcore.expression;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestExpressional {
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/expression/expConfig.xml",
				"com/springcore/steriotype/steConf.xml");
		Person per1 = context.getBean("person1", Person.class);
		per1.setId(77);
		System.out.println(per1);

		SpelExpressionParser exp = new SpelExpressionParser();
		Expression parseExpression = exp.parseExpression("33+66");
		System.out.println(parseExpression.getValue());
		System.out.println(per1.isFlag());

		System.out.println(per1.getMarks());
	}
}

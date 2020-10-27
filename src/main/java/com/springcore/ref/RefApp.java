package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefApp {


	private static ApplicationContext context ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		context = new ClassPathXmlApplicationContext("/com/springcore/ref/refConfig.xml");
		
		B objectB =(B)context.getBean("objB");
		System.out.println(objectB.getProfession());

		A objectA = (A) context.getBean("objA");
		System.out.println(objectA);
	}

}

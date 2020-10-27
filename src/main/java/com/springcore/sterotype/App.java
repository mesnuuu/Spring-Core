package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("com/springcore/sterotype/sterotype.xml");
		Student std = context.getBean("obj", Student.class) ;
		
		System.out.println(std);
		System.out.println(std.getAddress().getClass().getName());
		System.out.println(std.getAddress());
		

	}

}

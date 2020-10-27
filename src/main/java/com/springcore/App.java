package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		System.out.println("context loaded");

		Student std1 = (Student) context.getBean("std-1");
		// Student std2 = (Student)context.getBean("std-2");
		System.out.println(std1);
		// System.out.println(std2);
	}

}

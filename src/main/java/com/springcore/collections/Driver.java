package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {


	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("/com/springcore/collections/empconfig.xml");

		Emp emp1 = (Emp) context.getBean("emp-1");
		System.out.print(emp1);
	}

}

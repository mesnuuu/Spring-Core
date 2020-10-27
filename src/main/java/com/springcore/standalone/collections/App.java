package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;
import com.springcore.ref.B;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");

		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1.getFriends().getClass().getName()) ;
		System.out.println(p1.getFriends());
		System.out.println("________________________________");
		
		System.out.println(p1.getFeeStructure().getClass().getName());
		System.out.println(p1.getFeeStructure());
		System.out.println("________________________________");
		
		System.out.println(p1.getProperties().getClass().getName());
		System.out.println(p1.getProperties());
	}
}

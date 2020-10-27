package com.springcore.ci;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("/com/springcore/ci/ciconfig.xml");

		Person p  =  context.getBean("person", Person.class);
	//	System.out.print(p);
		
		List<String> list = p.getList();
		
			for(String var: list) {
				System.out.println(var);
			}
	}

	
}
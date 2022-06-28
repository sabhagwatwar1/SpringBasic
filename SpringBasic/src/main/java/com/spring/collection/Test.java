package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello world");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		 Emp emp=(Emp) context.getBean("emp");
		 System.out.println(emp);
	}
}

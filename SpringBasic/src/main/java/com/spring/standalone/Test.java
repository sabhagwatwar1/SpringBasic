package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/standalone/standalone.xml");
		Person p=(Person) context.getBean("per");
		System.out.println(p);
	}
}

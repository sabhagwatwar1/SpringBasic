package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/reference/refconfig.xml");
		A a=(A)context.getBean("abean");
		System.out.println("X="+a.getX());
		System.out.println("Y="+a.getOj().getY());
		System.out.println(a);
	}
}

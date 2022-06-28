package com.spring.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/constructor/injection/constructor.injection.config.xml");
		Person p=(Person)context.getBean("per");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getCer());
		System.out.println(p.getSport());
		System.out.println(p);
	}
}

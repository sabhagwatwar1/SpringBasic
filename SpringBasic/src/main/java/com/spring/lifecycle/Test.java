package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/lifecycle.xml");
		Person p=(Person)context.getBean("per");
		System.out.println(p);
		context.registerShutdownHook();
	}
}

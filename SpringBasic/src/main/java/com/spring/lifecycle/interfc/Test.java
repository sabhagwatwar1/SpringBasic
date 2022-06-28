package com.spring.lifecycle.interfc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	 AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/interfc/lifecycle.interface.xml");
	 Employee emp=(Employee)context.getBean("emp");
	 System.out.println(emp);
	 context.registerShutdownHook();
	 
}
}

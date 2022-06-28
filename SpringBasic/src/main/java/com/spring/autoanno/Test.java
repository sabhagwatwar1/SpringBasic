package com.spring.autoanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autoanno/autoanno.xml");
	Person p=context.getBean("per",Person.class);
	System.out.println(p);
 }
}

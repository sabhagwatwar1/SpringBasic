package com.spring.lifecycle.interfc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init");
	}
	
	
}

package com.spring.lifecycle;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
//	Calling mehtod using xml 
	public void start()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("inside destroy method");
	}
}

package com.spring.lifeannot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
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
@PostConstruct
public void start()
{
	System.out.println("init");
}
@PreDestroy
public void end()
{
	System.out.println("end");
}
}

package com.spring.autoanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.autowire.Address;

public class Person {

	@Autowired
	@Qualifier("add")
	private Address add;
	
	public Address getAdd(){
		return add;
	}
	
	public void setAdd(Address add) {
		this.add = add;
	}
	public Person(String name, Address add) {
		super();
	
		this.add = add;
	}
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [add=" + add + "]";
	}
	
	
}

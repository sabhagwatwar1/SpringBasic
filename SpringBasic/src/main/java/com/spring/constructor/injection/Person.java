package com.spring.constructor.injection;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi cer;
	private List<String> sport;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Certi getCer() {
		return cer;
	}
	public void setCer(Certi cer) {
		this.cer = cer;
	}
	public List<String> getSport() {
		return sport;
	}
	public void setSport(List<String> sport) {
		this.sport = sport;
	}
	public Person(String name, int id, Certi cer, List<String> sport) {
		super();
		this.name = name;
		this.id = id;
		this.cer = cer;
		this.sport = sport;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cer=" + cer + ", sport=" + sport + "]";
	}
	
}

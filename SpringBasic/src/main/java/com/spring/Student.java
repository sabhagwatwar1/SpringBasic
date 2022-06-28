package com.spring;

public class Student {
	private String name;
	private String lname;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String name, String lname, String city) {
		super();
		this.name = name;
		this.lname = lname;
		this.city = city;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lname=" + lname + ", city=" + city + "]";
	}
	
}

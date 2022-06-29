package com.spring.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> course;
	private Properties prop;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getCourse() {
		return course;
	}
	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Person(List<String> friends, Map<String, Integer> course, Properties prop) {
		super();
		this.friends = friends;
		this.course = course;
		this.prop = prop;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", course=" + course + ", prop=" + prop + "]";
	}
	
}

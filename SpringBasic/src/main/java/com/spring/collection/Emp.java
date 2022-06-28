package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	
	private List<String> id;
	private Set<String> name;
	private Map<String,String> profile;
	private Properties prop;
	public List<String> getId() {
		return id;
	}
	public void setId(List<String> id) {
		this.id = id;
	}
	public Set<String> getName() {
		return name;
	}
	public void setName(Set<String> name) {
		this.name = name;
	}
	public Map<String, String> getProfile() {
		return profile;
	}
	public void setProfile(Map<String, String> profile) {
		this.profile = profile;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Emp(List<String> id, Set<String> name, Map<String, String> profile, Properties prop) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.prop = prop;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", profile=" + profile + ", prop=" + prop + "]";
	}
	
}

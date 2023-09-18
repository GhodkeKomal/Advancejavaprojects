package com.prjmini.miniproject137.model;

public class pojo {
	
	String username;
	String password;
	public pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public pojo(int id, String name, String city) {
		super();
		this.username = name;
		this.password = city;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getCity() {
		return username;
	}
	public void setCity(String city) {
		this.username = city;
	}
	@Override
	public String toString() {
		return "pojo [id="  + ", name=" + username + ", city=" + username + "]";
	}


}


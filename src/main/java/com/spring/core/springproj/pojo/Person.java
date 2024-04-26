package com.spring.core.springproj.pojo;

public class Person {
	
	String name;
	String email;
	int personId;


	public Person(String name, String email, int id) {
		super();
		this.name = name;
		this.email = email;
		this.personId = id;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", personId=" + personId + "]";
	}


}

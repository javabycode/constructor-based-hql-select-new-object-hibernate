package com.javabycode.hibernate.model;

public class StudentExtended{
	
	String name;
	Long count;
	
	public StudentExtended(String name, Long count) {
		this.name = name;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "StudentExtended [name=" + name + ", count=" + count + "]";
	}
}

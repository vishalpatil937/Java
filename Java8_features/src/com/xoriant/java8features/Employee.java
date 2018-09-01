package com.xoriant.java8features;

public class Employee {
	private String name;
	private String designation;
	
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	public Employee() {
		name="Default";
		designation="Manager";
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + "]";
	}
	
}

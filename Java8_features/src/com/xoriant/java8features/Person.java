package com.xoriant.java8features;

public class Person {
	
	private Integer age;
	private String name;
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	public static int compareByAge(Person p1,Person p2) {
		return (p1.getAge()).compareTo(p2.getAge());
	}
	
	public  int compareByName(Person p1,Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
}

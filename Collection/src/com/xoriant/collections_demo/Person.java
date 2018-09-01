package com.xoriant.collections_demo;

public class Person {
	private int weight;
	private int height;
	private String name;
	
	public Person(String name, int weight, int height) {
		this.name=name;
		this.weight = weight;
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}
	
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}
}

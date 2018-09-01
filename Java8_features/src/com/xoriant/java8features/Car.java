package com.xoriant.java8features;

public class Car implements Vehicle{

	@Override
	public void drive() {
		System.out.println("Driving a car");
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Car!!!!!!!!!!");
		
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.Horn_vajav();
		c.drive();
		c.displayInfo();
	}
}

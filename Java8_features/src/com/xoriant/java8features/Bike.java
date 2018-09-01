package com.xoriant.java8features;

public class Bike implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Driving a bike");
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Bike!!!!!!!!!!!!!!");
		
	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.drive();
		b.displayInfo();
		b.Horn_vajav();
	}

}

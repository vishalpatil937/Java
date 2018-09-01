package com.xoriant.java8features;

public interface Vehicle {
	public void drive();
	public void displayInfo();
	public default void Horn_vajav() {
		System.out.println("Vajavla");
	}
}

package com.xoriant.java8features;

public class Demo {
	public static void main(String[] args) {
		Greetings greet1=()-> System.out.println("Shub Prabhat");
		Greetings greet2=()-> System.out.println("Shubh Dupar");
		Greetings greet3=()-> System.out.println("Shubh ratri");
		
		greet1.greet();
		greet2.greet();
		greet3.greet();
	}
}

package com.xoriant.java8features;

public class PredefinedInterface {
	public static void main(String[] args) {
		Runnable r1=() -> {System.out.println(Thread.currentThread().getName());};
		Runnable r2=() -> {System.out.println(Thread.currentThread().getName());};
		
//		r1=(Runnable) new PredefinedInterface();
		r1.run();
		r2.run();
	}
}

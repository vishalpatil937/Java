package com.xoriant.java8features;

public class DefaultMultipleInterface implements AnInterface,Aninterface2 {
	public static void main(String[] args) {
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		AnInterface.super.m1();
		Aninterface2.super.m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Aninterface2.super.m2();
		Aninterface2.super.m1();
	}		
	
}

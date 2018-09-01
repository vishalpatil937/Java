package com.xoriant.java8features;

public class Operations_demo_lambda {
	public static void main(String[] args) {

		Operations op1=(int a,int b)->System.out.println(a+b);
		Operations op2=(int a,int b)->System.out.println(a-b);
		Operations op3=(int a,int b)->System.out.println(a/b);
		Operations op4=(int a,int b)->System.out.println(a%b);
		Operations op5=(int a,int b)->System.out.println(a*b);

		op1.operation(3, 4);
		op2.operation(3, 4);
		op3.operation(3, 4);
		op4.operation(3, 4);
		op5.operation(3, 4);
		
	}
}

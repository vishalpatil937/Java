package com.xoriant.mypackage;

public class Test {
	public static void main(String[] args) {
		Class1 c1=new Class1();
		Class2 c2=new Class2();
		
		c1.default_method();
		c1.public_method();
		System.out.println("Class1: Default var="+c1.num2+"\tPublic var="+c1.num3+"\tProtected var="+c1.num4);
		System.out.println("Class1: Default var="+c2.num6+"\tPublic var="+c2.num7+"\tProtected var="+c2.num8);
		
		c2.default_method1();
		c2.public_method1();
	}
}

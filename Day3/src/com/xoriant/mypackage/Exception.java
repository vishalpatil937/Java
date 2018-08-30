package com.xoriant.mypackage;

public class Exception {
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		try {
			c=a/b;
			System.out.println("C is:"+c);
			String str ="Hello";
			System.out.println(str.charAt(10));
			
		}catch(ArithmeticException e) {
			System.out.println("b cannot be zero");
				try {
					c=a/b;
				}
				catch(ArithmeticException e1){
					e1.printStackTrace();
				}
//			System.exit(0);
//			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("String array of bounds");
		}
		finally {
			System.out.println("Finally");
		}
	}
}
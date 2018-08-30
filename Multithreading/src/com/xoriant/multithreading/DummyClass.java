package com.xoriant.multithreading;

public class DummyClass {
	DummyClass(){
		
	}
	public static void main(String[] args) {
		DummyClass c=new DummyClass();
		DummyClass d=new DummyClass();
		System.out.println(c.equals(d));
//		System.out.println(c==d);
		System.out.println("Obj of Classs (c):"+c.hashCode());
		System.out.println("Obj of Classs (d):"+d.hashCode());
		System.out.println(c.getClass());
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1+str1.toUpperCase());
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.hashCode());
		System.out.println(str1.hashCode());
		
		StringBuffer str0=new StringBuffer("abc");
		StringBuffer str11=new StringBuffer("abc");
		System.out.println("Hash of 0:"+str0.hashCode()+"\t Hash of 11:"+str11.hashCode());
		System.out.println(str0.reverse());
//		str0.append(1,"sdfsdf");
//		System.out.println(str0);
		
//		System.out.println(str2.split(" ")[1]+" "+str2.split(" ")[0]);
		
	}
}

package com.xoriant.collections_demo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assessment {
	static Set<Integer> set=new TreeSet<>();
	
	public static void less_than_7() {
		int size=set.size();
		int value;
		Iterator<Integer> ite=set.iterator();
		while(ite.hasNext()) {
			if((value=ite.next())<7) {
				System.out.println(value);
			}
		}
	}
	
	public static void less_than_equalto(int number) {
		int size=set.size();
		int value;
		Iterator<Integer> ite=set.iterator();
		while(ite.hasNext()) {
			if((value=ite.next())<number) {
				System.out.println(value);
			}
		}
	}
	
	public static void greater_than_equalto(int number) {
		int size=set.size();
		int value;
		Iterator<Integer> ite=set.iterator();
		while(ite.hasNext()) {
			if((value=ite.next())>number) {
				System.out.println(value);
			}
		}
	}
	
	public static void main(String[] args) {
		
		set.add(5);
		set.add(2);
		set.add(3);
		set.add(20);
		set.add(15);
		set.add(210);
		set.add(52);
		set.add(230);
		set.add(534);
		set.add(201);
		
		Assessment.less_than_7();
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Number de:");
		int upper_bound=sc.nextInt();
		
		Assessment.less_than_equalto(upper_bound);
		System.out.println("***************");
		Assessment.greater_than_equalto(upper_bound);
		
		
//		Remove first
		for(Integer it:set) {
			set.remove(it);
			break;
		}
	}
}

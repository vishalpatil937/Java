package com.xoriant.collections_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		
		System.out.println(list.size()+": "+list);
		System.out.println(list1.size()+": "+list1);
		
		list.add(20);
		list1.add(21);
		
		System.out.println(list.size()+": "+list);
		System.out.println(list1.size()+": "+list1);
		
		list.add(50);
		list.add(60);
		list.add(70);
		list1.add(51);
		list1.add(61);
		list1.add(71);
		
		System.out.println(list.size()+": "+list);
		System.out.println(list1.size()+": "+list1);
		
		list.remove(2);
		list1.remove(2);
		
		System.out.println(list.size()+": "+list);
		System.out.println(list1.size()+": "+list1);
		
		list.add(2, 100);
		list1.add(2, 101);
		
		System.out.println(list.size()+": "+list);
		System.out.println(list1.size()+": "+list1);
		
		boolean isAvailable=false;
		isAvailable=list.contains(100);
		if(isAvailable)
			System.out.println("sapadla");
		else
			System.out.println("Afsos");
		
		int sum=0,sum1=0;
//		Iteration
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
			sum1+=list1.get(i);
		}
		
		for(Integer inte : list ) {
			sum+=inte;
		}
		System.out.println(list.size()+": "+sum);
		System.out.println(list1.size()+": "+sum1);
		
		Iterator<Integer> itr=list.iterator();
		System.out.println(itr.getClass().getName());
		
		
		
		List<Integer> rev_list=new ArrayList<>();
		rev_list.add(21);
		rev_list.add(22);
		rev_list.add(23);
		rev_list.add(24);
		rev_list.add(25);
		for(int i=rev_list.size()-1;i>=0;i--)
			System.out.println(rev_list.get(i));
	}
}

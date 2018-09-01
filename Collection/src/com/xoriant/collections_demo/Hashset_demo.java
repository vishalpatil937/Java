package com.xoriant.collections_demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset_demo {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("Hashset:"+set);
		for(Integer inte:set) {
			System.out.println(inte);
		}
		
		set=new LinkedHashSet<>();
		set.add(20);
		set.add(10);
		set.add(60);
		set.add(70);
		set.add(80);
		System.out.println("LinkedHashset:"+set);
		for(Integer inte:set) {
			System.out.println(inte);
		}
		
		set=new TreeSet<>();
		set.add(20);
		set.add(10);
		set.add(60);
		set.add(70);
		set.add(80);
		System.out.println("treeset:"+set);
		for(Integer inte:set) {
			System.out.println(inte);
		}
	}
}

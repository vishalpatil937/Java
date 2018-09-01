package com.xoriant.collections_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator_demo {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("Hashset:"+set);
//		for(Integer inte:set) {
//			System.out.println(inte);
//		}
//		
		Iterator<Integer> itrset=set.iterator();
		while(itrset.hasNext()) {
			System.out.println(itrset.next());
		}
		
		System.out.println(itrset.getClass().getName());
	}
}

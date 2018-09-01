package com.xoriant.collections_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class navigableset_demo {
	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet=new TreeSet<>();
		navigableSet.add(30);
		navigableSet.add(40);
		navigableSet.add(50);
		navigableSet.add(60);
		navigableSet.add(70);
		navigableSet.add(90);
		navigableSet.add(80);
		
		System.out.println(navigableSet);
		System.out.println(navigableSet.ceiling(90));
		System.out.println(navigableSet.higher(90));
		System.out.println(navigableSet.lower(30));
		System.out.println(navigableSet.floor(30));
		
		SortedSet<Integer> hset= navigableSet.headSet(50,true);
		System.out.println(hset);
		
		SortedSet<Integer> tset1=navigableSet.tailSet(70);
		System.out.println(tset1);
		SortedSet<Integer> tset=navigableSet.tailSet(50,false);
		System.out.println(tset);
		
		SortedSet<Integer> tset2=navigableSet.subSet(30, true, 80, false);
		System.out.println(tset2);
		
		
		NavigableMap<Integer, String> nmap= new TreeMap<>();
		nmap.put(8, "Entry1");
		nmap.put(9, "Entry2");
		nmap.put(10, "Entry3");
		nmap.put(11, "Entry4");
		nmap.put(12, "Entry5");
		
		System.out.println(nmap);
		System.out.println(nmap.ceilingKey(7));
		
		System.out.println(nmap.firstEntry());
		
	}
}

package com.xoriant.collections_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_demo {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(132, "Hola");
		map.put(123, "Amigo");
		map.put(789, "Hello");
		map.put(465, "There");
		map.put(452, "There");
		map.put(5421, "There");
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		Iterator<Integer> ite=keys.iterator();
		while(ite.hasNext()){
			int key=ite.next();
			System.out.println(key);
			System.out.print("\t"+map.get(key));
		}
		
		
		Collection<String> values=map.values();
		for(String value:values)
			System.out.println(value);
		
		if(map.containsKey(123))
			System.out.println(map.get(123));
		
		map.remove(452);
		System.out.println();
		
		Set<Map.Entry<Integer, String>> entry=map.entrySet();
		Iterator<Map.Entry<Integer,String>> iter=entry.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> record=iter.next();
			System.out.println(record.getKey()+" : "+record.getValue());
			
		}
	
	}
}

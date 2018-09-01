package com.xoriant.collections_demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain {
	public static void main(String[] args) {
		Person p1=new Person("p1", 52, 60);
		Person p2=new Person("p2", 80, 87);
		Person p3=new Person("p3", 74, 21);
		Person p4=new Person("p4",52,51);
		
		Set<Person> s=new TreeSet<>(new Person_comparator());
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		
		System.out.println(s);
		
		Iterator<Person> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
 
class Person_comparator implements  Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		Integer w1=p1.getWeight();
		Integer w2=p2.getWeight();
		
		Integer h1=p1.getHeight();
		Integer h2=p1.getHeight();
		if(w1>w2) {
			return 1;
		}
		else if(w1==w2) {
			if(h1>h2)
				return 1;
			else
				return -1;
		}
		else
			return -1;
//		if((w1.compareTo(w2)) == 0) {
//			return h1.compareTo(h2);
//		}
//		else {
//		}
//		return  w1.compareTo(w2);
	}
	
}
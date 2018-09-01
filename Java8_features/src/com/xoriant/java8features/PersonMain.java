package com.xoriant.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> person=new ArrayList<>();
		person.add(new Person(28, "Abc"));
		person.add(new Person(23, "Abcd"));
		person.add(new Person(24, "Abcde"));
		person.add(new Person(25, "Abcdef"));
		person.add(new Person(26, "Abcdefg"));
		
		Person p=new Person();
		Collections.sort(person,p::compareByName);
		System.out.println(person);
		
		Collections.sort(person,Person::compareByAge);
		System.out.println(person);
		
	}
}

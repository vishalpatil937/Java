package com.assessment;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FruitMain {
	public static void main(String[] args) {
		
		List<Fruit> fruit =new ArrayList<>();
		fruit.add(new Fruit("a","red",78,78));
		fruit.add(new Fruit("b","orange",100,48));
		fruit.add(new Fruit("ads","blue",178,89));
		fruit.add(new Fruit("d","orange",20,178));
		fruit.add(new Fruit("e","blue",55,25));
		fruit.add(new Fruit("afd","red",728,778));
		fruit.add(new Fruit("df","red",69,28));
		
		Fruit f=new Fruit();
		Collections.sort(fruit,f::compareByCal);
		System.out.println(fruit);
		
		List<Fruit> Red=new ArrayList<>();
		List<Fruit> Orange=new ArrayList<>();
		List<Fruit> Blue=new ArrayList<>();
		
//		Color-wise list
		Fruit f1;
		Iterator<Fruit> ite=fruit.iterator();
		while(ite.hasNext()) {
			f1=ite.next();
			if(f1.getColor().equals("red"))
				Red.add(f1);
			else if(f1.getColor().equals("blue"))
				Blue.add(f1);
			else if(f1.getColor().equals("orange"))
				Orange.add(f1);
		}
		
		for(Fruit red:Red)
			System.out.println(red);
		System.out.println("*******************************************");
		for(Fruit orange:Orange)
			System.out.println(orange);
		System.out.println("*******************************************");
		for(Fruit blue:Blue)
			System.out.println(blue);
		System.out.println("*******************************************");
		
//		End of color list
		
//		Sort fruits with red color by price
		System.out.println("Red Fruits sorted in asc order of price");
		Collections.sort(Red,f::compareByPrice);
		for(Fruit red:Red)
			System.out.println(red);
		
		
//		Using Stream
		System.out.println(fruit.stream()
					.filter(p->p.getCalories()<100)
					.sorted(comparing(Fruit::getCalories).reversed())
//					.map(p->p.getName())
					.collect(toMap(Fruit::getName,Fruit::getCalories))
				);
		
		System.out.println(fruit.stream()
			.collect(groupingBy(Fruit::getColor))
		);
		
//		Group By colors
		Map<String, List<Fruit>> color= fruit.stream()
				.collect(groupingBy(Fruit::getColor));								
		
//		Display all fruit names of red color
		System.out.println(color.get("red").stream()
				.map(Fruit::getName)
				.collect(toList())
		);
		
		List<Fruit> fruits=color.get("red").stream()
				.collect(toList());
		System.out.println(fruits.stream().sorted(comparing(Fruit::getPrice)).collect(toList()));
		
	}
}

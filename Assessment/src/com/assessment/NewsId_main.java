package com.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.omg.CORBA.INTERNAL;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class NewsId_main {
	public static void main(String[] args) {
		List<News> news_list=new ArrayList<>();
		news_list.add(new News(8, "Abc", "User1", "comment1"));
		news_list.add(new News(4, "Cde", "User2", "comment8 budget"));
		news_list.add(new News(5, "Abc", "User3", "comment2"));
		news_list.add(new News(8, "Abc", "User4", "comment3"));
		news_list.add(new News(5, "Cde", "User5", "comment5 budget"));
		news_list.add(new News(4, "Def", "User6", "comment4"));
		news_list.add(new News(8, "Abc", "User7", "comment6"));
		
		List<Integer> news_id= news_list.stream().map(News::getNewsId).distinct().collect(toList());
		
//		Map<Integer ,Integer> values=news_list.stream()
//										.collect(toMap(news_list.stream().map(News::getNewsId).distinct(),(Integer)news_list.stream()
//												.collect(groupingBy(News::getNewsId)).get(news_list.stream().map(News::getNewsId).distinct()).size()));
		
//		NewsID with max comments
		Map<Integer,List<News>> map=news_list.stream()
				.collect(groupingBy(News::getNewsId));
		Map<Integer , Integer> key_value = new HashMap<>();
		for(Integer i:news_id) {
			key_value.put(i, map.get(i).size());
		}
		System.out.println("Maximum comments are of News Id:"+key_value.entrySet().stream().max((e1,e2)->e1.getValue()>e2.getValue()?1:-1).get().getKey());
		
	}
}	

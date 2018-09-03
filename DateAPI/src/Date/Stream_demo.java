package Date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Stream_demo {
	
	public static void sort_lowcalories(List<Dish> menu) {
		Dish d=new Dish();
		List<Dish> lower_cal=new ArrayList<>();
		
		for(Dish dish:menu) {
			if(dish.getCalories()<400)
				lower_cal.add(dish);
		}
		
		Collections.sort(lower_cal,d::sortByName);
		System.out.println(lower_cal);
		
	}
	
	public static List<String> sort_lowcalories_java8(List<Dish> menu){
		return menu.stream()
				.filter(d->d.getCalories()<400)
				.sorted(comparing(Dish::getName))
				.map(Dish::getName)
				.collect(toList());
	}
	
	public static void main(String[] args) {
		
		sort_lowcalories(Dish.menu);
		System.out.println(sort_lowcalories_java8(Dish.menu));
		
//		System.out.println(Dish.menu.stream().findAny());
		
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6);
		stream.forEach(s->System.out.println(s));
	
	}

}

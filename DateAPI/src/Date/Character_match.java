package Date;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Character_match {
	public static void main(String[] args) {
		List<String> members =new ArrayList<>();
		members.add("Amitabh");
		members.add("Shekhar");
		members.add("Ajit");
		members.add("Rahul");
		members.add("Salman");
		members.add("Shahrukh");
		members.add("Yana");
		members.add("Lokesh");
		
		List<String> start_with_A =new ArrayList<>();
		
		System.out.println(members.stream()
									.filter(p->p.charAt(0)=='A')
									.sorted()
									.map(String::toUpperCase)
									.collect(toList()));
		
//		System.out.println(members);
	}
}

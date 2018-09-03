package Date;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class forEachdemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(45);
		list.add(78);
		list.add(21);
		list.add(213);
				
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer arg0) {
//				System.out.println(arg0);
//			}
//		});
		
		list.forEach(l->System.out.println(l));
	}
}	

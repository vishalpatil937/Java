package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] a) {
//		int array[];
//		array =new int[10];
//		Scanner sc=new Scanner(System.in);
//		int count=0;
//		count=sc.nextInt();
//		for(int i=0;i<count;i++) {
//			array[i]=sc.nextInt();
//		}
//		
////		For each
//		for(int ite:array) {
//			System.out.println("Array[]="+ite);
//		}
		
		Dictionary d = new Dictionary();
		Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
		String word,meaning;
		for(int i=0;i<count;i++) {
			word=sc.next();
			meaning=sc.next();
			d.Add(word, meaning,i);
		}
		System.out.println("Done Storing");
		count=sc.nextInt();
		for(int j=0;j<count;j++) {
			System.out.println(d.getMeaning(sc.next()));
		}
	}
}

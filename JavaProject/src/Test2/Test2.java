package Test2;

import java.util.Scanner;

public class Test2 {
	public static void main(String s[]) {
		Person[] p=new Person[3];
		Scanner sc =new Scanner(System.in);
		int d,y;
		String m;
		for(int j=0;j<3;j++) {
			  p[j] =new Person();
			  System.out.println("Enter Name:");
			  p[j].setPerson_name(sc.next());
			  System.out.println("Enter Number");
			  p[j].setPerson_telephone(sc.nextInt());
			  System.out.println("Enter your ID:");
			  p[j].setPerson_ID(sc.nextInt());
			  System.out.println("----DOB----");
			  System.out.println("Day:");
			  d=sc.nextInt();
			  System.out.println("Month:");
			  m=sc.next();
			  System.out.println("Year");
			  y=sc.nextInt();
			  System.out.println(d+m+y);
			  p[j].addDOB(d, m.toString(), y);
		}
		System.out.println("\nDetails Stored are:\n");
		for(int j=0;j<3;j++) {
			System.out.println("Name:"+p[j].getPerson_name());
			System.out.println("ID:"+p[j].getPerson_ID());
			System.out.println("Number:"+p[j].getPerson_telephone());
			System.out.println("DOB:");
			p[j].getDOB();
		}
	}	
}
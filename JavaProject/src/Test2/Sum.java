package Test2;

import java.util.Scanner;

public class Sum {
	public static void main(String[] arg) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		checksum(a,b,c);
	}
	static void checksum(int a,int b,int c) {
		if(a+b==c || a+c==b ||b+c==a)
			System.out.println("Jamtay");
		else
			System.out.println("Nai jamnar");
	}
}

package Test2;

import java.util.Scanner;
public class PrimeFactors {
	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		primefactors(number);
	}
	
	public static void primefactors(int number) {
		int flag=1;
		int dirty=-1;
		int range=(int)Math.sqrt(number);
		for(int j=2;j<number/2;j++) {
			for(int i=2;i<=(int)Math.sqrt(j);i++) {
				if(j%i==0) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			if(flag==1) {
				if(number%j==0) {
					if(j!=2 && j!=3 && j!=5 ) {
						dirty=0;
						break;
					}
					else {
						dirty=1;
					}
				}
			}
				
		}
		if(dirty==0)
			System.out.println("Not dirty");
		else if(dirty==1)
			System.out.println("Dirty");
	}
}
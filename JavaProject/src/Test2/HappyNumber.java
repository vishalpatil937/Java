package Test2;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String a[]) {
		int op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option\n(1)Swatahcha number\t(2)Range madhle number");
		int choice=sc.nextInt();
		if(choice==1){
			int number=sc.nextInt();
			op=happy(number);
			if(op==1)
				System.out.println("Anandit");
			else
				System.out.println("Not so Anandit");
		}
		else {
			int lb,ub;
			System.out.println("Enter lower bound:\n");
			lb=sc.nextInt();
			System.out.println("Enter upper bound:\n");
			ub=sc.nextInt();
			for(int i=lb;i<ub;i++) {
				op=happy(i);
				if(op==1)
					System.out.println(i);
			}
		}
		
		
	}
	static int sqsum(int num) {
		int sum=0;
		while(num>0) {
			sum+=(int) Math.pow(num%10, 2);
			num/=10;
		}
		return sum;
	}
	static int happy(int number) {
		int sq,sqsq;
//		int repeat=0;
//		int i=0;
		sq=sqsum(number);
		sqsq=sqsum(sqsum(number));
		while(sq!=sqsq) {
			sq=sqsum(sq);
			sqsq=sqsum(sqsum(sqsq));
//			if(i==0) {
//				repeat=number;
//				System.out.println("repeat="+repeat);
//				i++;
//			}
//			else {
//				System.out.println("In else\t repeat="+repeat);
//				if(repeat==number) {
//					System.out.println("Not a happy number");
//					break;
//				}
//				
//			}
//			System.out.println(sum);
		}
		if(sq==1) {
			return 1;
			
		}
		else {
			return 0;
			
		}
	}
}	
package Test2;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter numbers:");
		int stop=1;
		int index=0;
		while(stop!=-1) {
			input[index]=sc.nextInt();
			stop=input[index];
			index++;
			
		}
		System.out.println("The order in which input entered is:");
		int order=check_order(input,index-2);
		System.out.println(order);
		if(order==0) {
			System.out.println("Not in any order,nit taak");
		}
		else if(order==-1)
			System.out.println("Desc");
		else if(order==1)
			System.out.println("Asc");
	}

	public  static int check_order(int[] arr,int index) {
		int flag =0;
		int preflag=0;
		for(int i=0;i<index;i++) {
			if(arr[i]<arr[i+1]) {
				flag=1;
			}
			else {
				flag=-1;
			}
			if(preflag!=flag && flag!=0 && preflag!=0) {
				flag=0;
				break;
			}
			else
				preflag=flag;
		}
		return flag;
	}
}
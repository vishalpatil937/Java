package Test2;

public class Assessment9 {
	public static void main(String a[]) {
		int arr[]= {214,921,552,180,900,125,124,584,232};
		if(tens(arr))
			System.out.println("Sum is 30");
		else
			System.out.println("Sum is not 30");
			
	}
	public static boolean tens(int arr[]) {
		int len=arr.length;
		int sum=0,temp;
		for(int i=0;i<len;i++) {
			temp=arr[i]/10;
			temp%=10;
			sum+=temp;
		}
		if(sum==30)
			return true;
		else 
			return false;
	}
}

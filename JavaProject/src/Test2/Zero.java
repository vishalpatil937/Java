package Test2;

public class Zero {
	public static void main(String[] s) {
		int arr[]={5,8,0,1,4,0,3,9,7,0};
		int len=arr.length;
//		System.out.println(len);
		int temp;
		int isblock=0;
		int endblock,startblock;
		int zero_index=-1;
		for(int i=0;i<len;i++) {
//			System.out.println(i);
			temp=arr[i];
			if(temp==0 && i+1<len) {
				if(isblock==0) {
					zero_index=i;
				}
				if(arr[i+1]!=0) {
					if(isblock==1)
						endblock=i+1;
					System.out.println("arr["+zero_index+"]="+arr[zero_index]+"\t"+"arr["+(i+1)+"]="+arr[i+1]);
					arr[zero_index]=arr[i+1];
					arr[i+1]=0;
					
					System.out.println("i="+i);
				}
				else {
					startblock=i;
					isblock=1;
//					continue;  
				}
			}
		}
		
//		Display all
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
	}

		
}
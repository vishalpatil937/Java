package Test2;

public class Duplicate_elem {
	static int visited[];
	static int[] corect_array;
	static int lengthy;
	public static void main(String a[]) {
		int arr[]= {214,921,552,180,900,125,124,654,214};
		visited=new int[arr.length];
		corect_array=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			visited[i]=0;
		System.out.println("The initial length of array is: "+arr.length);
		remove_dupl(arr);
		System.out.println("The length is: "+lengthy);
		
	}
	public static void remove_dupl(int arr[]) {
		int temp;
		int tot_length=arr.length;
		int ind=0;
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==1) {
				continue;
			}
			else {
				temp=arr[i];
				visited[i]=1;
				System.out.println("param to contains:"+arr[i]);
				int index=contains(arr,arr[i]);
				System.out.println("o/p from contains"+index);
				if(index!=-1) {
					tot_length--;
					corect_array[ind]=temp;
					ind++;
				}
			}
		}
		lengthy=tot_length;
	}
	
	public static int contains(int arr[],int elem) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			System.out.println("in contains:"+arr[i]+"elem:"+elem);
			if(arr[i]==elem && visited[i]!=1 ) {
				index=i;
				visited[i]=1;
			}
		}
		return index;
	}
	
}

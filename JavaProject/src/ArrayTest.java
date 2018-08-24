
public class ArrayTest {
	public static void test(String intArr,int... inte) {
		long start=System.currentTimeMillis();
//		for(String i :intArr)
			System.out.println(intArr);
		for(int i:inte)
			System.out.println(i);
		long end=System.currentTimeMillis();
		System.out.println("Total time:"+(end-start));
	}
	public static void main(String s[]) {
//		 test(new int[]  {1,2,3,4,5});
//		test(1,2,3);
		test("hgfgf",1,2,3,4,5);
	}	
}

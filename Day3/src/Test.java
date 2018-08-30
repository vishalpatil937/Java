import com.xoriant.mypackage.*;
import static com.xoriant.mypackage.Class1.a;
import static java.lang.System.out;
public class Test extends Class1 {
	public static void main(String[] args) {
		
		Class1 c1=new Class1();
//		c1.default_method();
		c1.public_method();
		Test t=new Test();
		System.out.println("Static imported a="+a);
		System.out.println("Class1: Default var=Not visible"+"\tPublic var="+c1.num3+"\tProtected var="+t.num4);
	}
}

package test3;

class A{
	public A() {
		System.out.println("Class A");
	}
}

class  B extends A{
	public B() {
		System.out.println("Class B");
	}
}

class  C extends B{
	public C() {
		System.out.println("Class C");
	}
}

public class Multilevel {
	public static void main(String a[]) {
		new C();
	}
}

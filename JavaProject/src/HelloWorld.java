public class HelloWorld {
	HelloWorld(String Name,int Age){
		this.name=Name;
		this.age=Age;
		 System.out.println("Hello World");
	}
	HelloWorld(boolean a){
		this.a=a;
	}
//	{ System.out.println("Hello World"); }
	 private String name;
	 private int age;
	 private boolean a;
//	public static void main(String[] args) {
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String get() {
		return "Age:"+this.age+"\nNAme:"+this.name+"\nBool:"+this.a;
	}
		
//		Scanner name=new Scanner(System.in);
//		String input=name.next();
//		Scanner ageip=new Scanner(System.in);
//		int age=ageip.nextInt();
		
//		System.out.println("Name:"+name+"\nAge:"+ageip);
		
//	}
}

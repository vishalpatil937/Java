import java.util.Scanner;
import Test.*;
public class Class2 {
	public static void main(String[] a) {
		HelloWorld person =new HelloWorld("Abced",22);
//		person.setName("Abcde");
//		person.setAge(32);
//		person.name="Abc";
//		person.age=22;
		int i;
		Test t=new Test();
		t.main(a);
		System.out.println(person.get());
		Employee[] e = new Employee[10];
		Scanner sc =new Scanner(System.in);
		i=sc.nextInt();
		for(int j=0;j<i;j++) {
			  e[j] =new Employee();
			  e[j].setName(sc.next());
			  e[j].setDept(sc.next());
			  e[j].setDesign(sc.next());
			  e[j].setSalary(sc.nextInt());
		}
		for(int  j=0;j<i;j++) {
			System.out.println("Department: "+e[j].getDept());
			System.out.println("Name: "+e[j].getName());
			System.out.println("Design: "+e[j].getDesign());
			System.out.println("Salary "+e[j].getSalary());
			System.out.println("Allowance "+e[j].getAllowance(e[j].getDesign()));
		}
//		Employee e[]=new Employee();
//		Employee r=new Employee("Name2","tech","TL",20000);
//		Employee s=new Employee("Name2","Admin","TM",20000);
//		Employee t=new Employee("Name2","tech","Others",20000);
//		Employee u=new Employee("NAme3","Admin","Admin",30000);

//		System.out.println(e.getAllowance("Admin"));
	}
}
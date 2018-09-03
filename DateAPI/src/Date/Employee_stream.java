package Date;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Employee_stream {
	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(1,"Onkar","Trainer",50000,10));
		emplist.add(new Employee(1,"Amit","Admin",30000,20));
		emplist.add(new Employee(1,"Rahul","HR",40000,30));
		emplist.add(new Employee(1,"Ajay","Trainer",55000,10));
		emplist.add(new Employee(1,"Kiranr","Admin",35000,20));
		emplist.add(new Employee(1,"Kumar","HR",40500,30));
		emplist.add(new Employee(1,"Ajit","CEO",50000,100));
		emplist.add(new Employee(1,"Laxman","Trainer",35000,10));
		
		System.out.println(emplist.stream()
			.filter(p-> (p.getDeptno()==10 && p.getSalary()>20000))
			.sorted(comparing(Employee::getEname))
			.collect(toList())
		);
		
	}
}

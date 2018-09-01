package com.xoriant.java8features;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeFactory1 emp=Employee::new;
		Employee e=emp.getEmployee();
		System.out.println(e);
	
		EmployeeFactory2 emp1=Employee::new;
		Employee e1=emp1.getEmployee("Arg-constructor", "khgjh");
		System.out.println(e1);
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
	private String design; 
	private String name;
	private String dept;
	private int salary;
	
//	Employee(String empname,String dept,String design,int salary){
//		name.add(empname);
//		this.dept.add(dept);
//		this.design.add(design);
//		this.salary.add(salary);
//	}
	
	public int getAllowance(String design1) {
		int ret=0;
		if(design1.equals("PL"))
			ret=1600;
		else if(design1.equals("TM"))
			ret=1300;
		else if(design1.equals("TL"))
			ret=1270;
		else if(design1.equals("Admin"))
			ret=1500;
		else if(design1.equals("Others"))
			ret=1100;
		return ret;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}


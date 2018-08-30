package test3;

public class Employee extends Parent {
	private int empcode;
	private String dept;
	private String designation;
	
	Employee(int empcode,String dept,String designation,String name,int age,String address){
		super(name,age,address);
		setEmpcode(empcode);
		System.out.println(empcode);
	}
	
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", dept=" + dept + ", designation=" + designation + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

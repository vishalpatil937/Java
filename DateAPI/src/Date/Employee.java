package Date;

public class Employee {
	int empno;
	String ename;
	String job;
	double salary;
	int deptno;
	
	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getDeptno() {
		return deptno;
	}
	

	public Employee(int empno, String ename, String job, double salary, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
		this.deptno = deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptno="
				+ deptno + "]";
	}
	
	public int sortByName(Employee e1,Employee e2) {
		return e1.getEname().compareTo(e2.getEname());
	}
	
}

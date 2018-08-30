package test3;

public class Parent {
	private String name;
	private int Age;
	private String Address;
	
	Parent(String name,int age,String address){
		setAge(age);
		setName(name);
		setAddress(address);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
}

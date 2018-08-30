package com.xoriant.mypackage;

public class User {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if(age<18) {
			throw new AgeException("Age cannot be less than 18");
		}
		else
			this.age = age;
	}
	
	public static void main(String[] args)  {
		User user=new User();
		try {
			user.setAge(12);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {}
	}
}

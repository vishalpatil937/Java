package Test2;

import java.util.Scanner;

public class Person {
	private int person_ID;
	private String person_name;
	private long person_telephone;
	private int day;
	private int year;
	private String month;
	public  DOB dob = new DOB();
	

	public void addDOB(int d,String m,int y) {
		dob.setDate(d, m, y);
	}
	
	public void getDOB() {
		 dob.getDate();
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getPerson_ID() {
		return person_ID;
	}
	public void setPerson_ID(int person_ID) {
		this.person_ID = person_ID;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public long getPerson_telephone() {
		return person_telephone;
	}
	public void setPerson_telephone(long person_telephone) {
		this.person_telephone = person_telephone;
	}
	
}
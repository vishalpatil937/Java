package Test2;

public class DOB {
	private int day;
	private int year;
	private String month;
	public void setDate(int day,String month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void getDate() {
		System.out.println("DOB:"+day+" /"+month+"/ "+year);
	}
}

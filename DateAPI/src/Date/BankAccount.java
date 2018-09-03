package Date;

public class BankAccount {
	private int accNo;
	private String accName; 
	private int accBal;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	public BankAccount(int accNo, String accName, int accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + "]\n";
	}
	
}

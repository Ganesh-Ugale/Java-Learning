package inheritance.singlelevel;

public class BankAccount {
//	Actions
	String name;
	String ifsc;
	String bankName;
	long accNo;
	int pin;
	String branch;
	long phoneNo;
	
//	No-Args Constructor
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
//	Parameterized Constructor
	public BankAccount(String name, String ifsc, String bankName, long accNo, 
			int pin, String branch, long phoneNo) {
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accNo = accNo;
		this.pin = pin;
		this.branch = branch;
		this.phoneNo = phoneNo;
	}
	
//	Behaviors
	public void displayBank() {
		System.out.println("Name: " + name);
		System.out.println("ifsc: " + ifsc);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Num: " + accNo);
		System.out.println("Pin: " + pin);
		System.out.println("Branch: " + branch);
		System.out.println("Phone Num: " + phoneNo);
	}
	
}

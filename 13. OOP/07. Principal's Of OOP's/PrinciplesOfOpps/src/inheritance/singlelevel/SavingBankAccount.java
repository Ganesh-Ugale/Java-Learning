package inheritance.singlelevel;

public class SavingBankAccount extends BankAccount{
//	Actions
	double balance;
	double interest;
	String type;
	
//	No-Args Constructor
	public SavingBankAccount() {
		// TODO Auto-generated constructor stub
	}
	
//	Parameterized Constructor
	public SavingBankAccount(String name, String ifsc, String bankName, long accNo, 
			int pin, String branch, long phoneNo, double balance, 
			double interest, String type) {
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accNo = accNo;
		this.pin = pin;
		this.branch = branch;
		this.phoneNo = phoneNo;
		
		this.balance = balance;
		this.interest = interest;
		this.type = type;
	}
	
//	Actions
	public void displaySavingAccount() {
		displayBank();
		
		System.out.println("Balance: " + balance);
		System.out.println("Interest: " + interest);
		System.out.println("Type: " + type);
	}
}

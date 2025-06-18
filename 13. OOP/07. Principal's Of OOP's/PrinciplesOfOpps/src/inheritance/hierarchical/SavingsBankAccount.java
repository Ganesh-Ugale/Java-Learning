package inheritance.hierarchical;

//Acquiring the all properties and behaviors from Bank account

public class SavingsBankAccount extends BankAccount{
//	Actions
	double balance;
	double interest;
	String type;
	
//	No-Args Constructor
	public SavingsBankAccount() {
		// TODO Auto-generated constructor stub
	}
	
//	Parameterized Constructor
	public SavingsBankAccount(String name, String ifsc, String bankName, long accNo, 
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
		System.out.println("---|| Savings Account ||---");
		System.out.println("Balance: " + balance);
		System.out.println("Interest: " + interest);
		System.out.println("Type: " + type);
	}
}
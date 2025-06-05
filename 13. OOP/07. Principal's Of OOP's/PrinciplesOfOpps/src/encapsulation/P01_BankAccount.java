package encapsulation;


public class P01_BankAccount {
//  attributes
	private String username ;
	private String bankName ;
	private long accountNum ;
	private int pin ;
	private String ifscCode ;
	private double balance ;
	
//	Here no need to add the default constructor bcz we did not give an access to the user to create an empty account
//  Compiler will not add any constructor if programmer already added a any constructor in a blueprint.
//  When programmer not add any constructor in blueprint so compiler added a default constructor.

	P01_BankAccount(String userName, String bankName, long accountNum, int pin, String ifscCode ) {
		username = userName;
		this.bankName = bankName;
		this.accountNum = accountNum;
		this.pin = pin;
		this.ifscCode = ifscCode;
	}
	
//	Here we designing an getter methods and setter methods.
	public String getUserName() {
		return username;
	} 
	
	public String getBankName() {
		return bankName;
	}
	
	public long getAccountNum() {
		return accountNum;
	}
	
	public void setPin(long accountNum, int oldPin, int newPin) {
		if (this.accountNum == accountNum && pin == oldPin) {
			pin = newPin;
			System.out.println("Pin Updated!");
		}
		else {
			System.out.println("Invalid Credentials...!");
		}
	}
	
	public String getIfscCode() {
		return ifscCode;
	}
	
	public double getBalance(long accountNum, int pin) {
		if (this.accountNum == accountNum && this.pin == pin) {
			if (this.balance == 0.0) {
				System.out.println("Add Minimum Balance Rs. 1000.0!");
			}
			return balance;
		}
		else {
			System.out.println("Invalid Credentials...!");
			return 0;
		}
	}
	
	public void credit(long accountNum, int pin, double amount) {
		if (this.accountNum == accountNum && this.pin == pin) {
			if (amount > 0) {
				balance += amount;
				System.out.println("Amount Credited!");
				System.out.println("Your Available Balance is: " + this.balance);
			}
			else {
				System.out.println("Invalid Amount!");
			}
		}
		else {
			System.out.println("Invalid Credentials...!");
		}
	}
	
	public void debit(long accountNum, int pin, double amount) {
		if (this.accountNum == accountNum && this.pin == pin) {
			if (amount > 0) {
				if (balance - amount > 1000) {
					balance -= amount;
					System.out.println("Amount Debited...!");
					System.out.println("Your Available Balance is: " + this.balance);
				}
				else {
					System.out.println("Insufficient Balance!");
				}
			}
			else {
				System.out.println("Invalid Amount!");
			}
		}
		else {
			System.out.println("Invalid Credentials...!");
		}
	}
}

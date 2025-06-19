package inheritance.hierarchical;

public class DmartAccount extends BankAccount{
	
	String brokerage;
	int tPin;
	int mPin;
	
	public DmartAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public DmartAccount(String name, String ifsc, String bankName, long accNo, 
			int pin, String branch, long phoneNo, String brokerage, int tPin, int mPin) {
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accNo = accNo;
		this.pin = pin;
		this.branch = branch;
		this.phoneNo = phoneNo;
		
		this.brokerage = brokerage;
		this.tPin = tPin;
		this.mPin = mPin;
	}
	
	public void displayDmartAccount() {
		displayBank();
		System.out.println("---|| Dmart Account ||---");
		System.out.println("Brokerage : " + brokerage);
		System.out.println("tPin : " + tPin);
		System.out.println("mPin : " + mPin);
	}
}

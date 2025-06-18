package inheritance.hierarchical;

// Acquiring the all properties and behaviors from Bank account

public class LoanAccount extends BankAccount {
	
	String timePeriod;
	int roi;
	String typeOfLoan;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}

	public LoanAccount(String name, String ifsc, String bankName, long accNo, 
			int pin, String branch, long phoneNo, String timePeriod, int roi, String typeOfLoan) {
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accNo = accNo;
		this.pin = pin;
		this.branch = branch;
		this.phoneNo = phoneNo;
		
		this.timePeriod = timePeriod;
		this.roi = roi;
		this.typeOfLoan = typeOfLoan;
	}
	
	public void displayLoanAccount() {
		displayBank();
		System.out.println("---|| Loan Account ||---");
		System.out.println("Time Period : " + timePeriod);
		System.out.println("ROI : " + roi);
		System.out.println("typeOfLoan : " + typeOfLoan);
	}
	
}

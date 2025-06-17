package inheritance.hierarchical;

public class BankDriver {
	
	public static void main(String[] args) {
		
		SavingsBankAccount s1 = new SavingsBankAccount("Ganesh Ugale", "SBI12345", "SBI Account", 
				60183239236l, 123, "Pune", 8999169526l, 50000, 3, "Savings Account");
		
		s1.displayBank();
		
		System.out.println("--------------------------------------------------------------");
		
		s1.displaySavingAccount();
		
		System.out.println("--------------------------------------------------------------");
		
		LoanAccount l1 = new LoanAccount("Ganesh Ugale", "SBI12345", "SBI Account", 
				60183239236l, 123, "Pune", 8999169526l, "12 Months", 3, "Education Loan");
		
		l1.displayBank();
		
		System.out.println("--------------------------------------------------------------");
		
		l1.displayLoanAccount();
		
		System.out.println("--------------------------------------------------------------");
		
		DmartAccount d1 = new DmartAccount("Ganesh Ugale", "SBI12345", "SBI Account", 
				60183239236l, 123, "Pune", 8999169526l, "Investing", 456, 789);
		
		d1.displayBank();
		
		System.out.println("--------------------------------------------------------------");
		
		d1.displayDmartAccount();
		
		
	}
}

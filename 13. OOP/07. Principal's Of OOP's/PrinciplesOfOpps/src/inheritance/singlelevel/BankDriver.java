package inheritance.singlelevel;

public class BankDriver {
	public static void main(String[] args) {
		
		SavingBankAccount s1 = new SavingBankAccount("Ganesh D. Ugale", "SBI2389",
				"SBI", 21341234548l, 123, "Khedgaon", 8999169526l, 5000.0, 3.0,
				"Saving Account");
		
		s1.displaySavingAccount(); // Derived Class Acquires all members from Super Class
		
		System.out.println("-----------------------------------------------");
		
		s1.displayBank(); // This Behaviors acquires from Super Class using Derived Class.
	}
}
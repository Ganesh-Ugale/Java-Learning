/*
Using Static Var, Create a Creadit and Debit Amount System

How the Static var can store a value and Other Members of the class can be access the static var
*/

class P02_StaticVar{

	static double balance; // This Static Var can be Access in whole class globally.

	public static void main(String[] args) {
		credit(1000); // 1 Credit the Amount in balance
		debit(900); // Debit the amount from balance
	}
	// Methods
	public static void credit(double amt){
		balance += amt;  // here First amt value add in balance var
		System.out.println("Amout Creadited!");
		System.out.println("Your Current Balance is : " + balance);
	}

	public static void debit(double amt){
		if (amt > 0 && balance - amt >= 100) {  // Minimum user account balance is must 100 remains in balance.
			balance -= amt; // here then after created, amt is debit from balance.
			System.out.println("Amout Debited!");
			System.out.println("Your Current Balance is : " + balance);
		}
		else{
			System.out.println("INVALID AMOUNT!"); // if user enterd amt is 0 OR less than 0 and also (balance - amt >= 100) if this condition false
		}
	}
}
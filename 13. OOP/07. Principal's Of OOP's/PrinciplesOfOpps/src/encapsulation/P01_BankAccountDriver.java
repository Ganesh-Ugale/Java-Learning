package encapsulation;

public class P01_BankAccountDriver {
	public static void main(String[] args) {
//		Object Creation Statement
		P01_BankAccount b1 = new P01_BankAccount("Ganesh Ugale", "SBI", 60183239236l, 123, "SBI0001832");
		
//		Try to Fetch the balance
		System.out.println(b1.getBalance(60183239236l, 123));
		
//		Crediting Amount
		b1.credit(60183239236l, 123, 10000);
		
//		Debt amount
		b1.debit(60183239236l, 123, 1000);
		
//		Fetch the Available Balance
		System.out.println(b1.getBalance(60183239236l, 123));
		
//		Setting the new Pin
		b1.setPin(60183239236l, 123, 1234);
		
//		Try to Debt the amount
		b1.debit(60183239236l, 1234, 5000);
	}
}

class P03_ATM{
	
	static String bName = "\nState Bank Of India\n";
	static double withdrawLimit = 50000;
	static String bankHrs = "10 AM to 4 PM";

	static
	{
		System.out.println("\nSetting the ATM Configurations...");
		atmRules();
	}

	public static void main(String[] args) {
		deposit(30000);
		System.out.println("\nCome Again!");
	}

	// Method
	public static void atmRules(){
		System.out.println("\n--- || Rules of Bank ||---\n");
		System.out.println("Working Hourse : " + bankHrs);
		System.out.println("Withdrwal Limit : " + withdrawLimit);
		System.out.println("--------------------------------------");
	}

	public static void deposit(int amt){
		if (amt > 0 && amt <= withdrawLimit) {
			System.out.println("\nAmout Withdraw Succefully : " + amt);
			System.out.println("Remaining Limit of Withdraw : " + (withdrawLimit -  amt));
		}
		else{
			System.out.println("\nAmount Exceeds the ATM Limit!!!");
		}
	}
}
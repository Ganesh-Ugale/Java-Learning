class P02_InterestRateSetup{

	// static members
	static double interestRate = 4.5;

	static  // static block
	{
		System.out.println("\nInterset Rate is Initialized!\n");
	}

	public static void main(String[] args) {
		showInterest(); // calling a static method
	}

	// Method
	public static void showInterest(){
		System.out.println("Current Interest Rates : " + interestRate);
	}
}
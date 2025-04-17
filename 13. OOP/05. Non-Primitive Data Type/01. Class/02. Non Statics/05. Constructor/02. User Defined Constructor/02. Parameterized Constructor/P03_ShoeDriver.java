class P03_ShoeDriver{
	public static void main(String[] args) {
		
		System.out.println("\n--------|| Main Method Starts ||--------\n");

		// Object Creation Statement with no args constructor
		P03_Shoe s1 = new P03_Shoe();
		s1.displayShoe();

		System.out.println("\n-----------------------------------------------------------\n");

		// Object Creation Statement with parameterized args constructor
		P03_Shoe s2 = new P03_Shoe(2000d, 10, "Sports", "Blue");
		s2.displayShoe();

		System.out.println("\n--------|| Main Method Ends ||--------\n");
	}
}
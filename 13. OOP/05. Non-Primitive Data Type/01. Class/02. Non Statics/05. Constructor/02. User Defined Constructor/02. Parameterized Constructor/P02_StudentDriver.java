class P02_StudentDriver{
	public static void main(String[] args) {
		
		System.out.println("\n********|| Main Method Starts ||********\n");

		// Creating Object and with para-constructor
		P02_Student s1 = new P02_Student("Raju", 21, "SVIT College", "BE", 345);
		s1.displayStudent();

		System.out.println("\n-------------------------------------------------------------\n");

		// Creating Object and with no-args constructor
		P02_Student s2 = new P02_Student();
		s2.displayStudent();


		System.out.println("\n********|| Main Method Ends ||********\n");
	}
}
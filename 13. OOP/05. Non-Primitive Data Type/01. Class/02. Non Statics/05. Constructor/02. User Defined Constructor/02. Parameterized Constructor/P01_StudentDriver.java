class P01_StudentDriver{
	public static void main(String[] args) {
		
		System.out.println("\n********|| Main Method Starts ||********\n");

		// Object Creation with pass the args to constructor
		P01_Student s1 = new P01_Student("Raju", 21, "SVIT College", "BE", 345);
		s1.displayStudent();


		System.out.println("\n********|| Main Method Ends ||********\n");
	}
}
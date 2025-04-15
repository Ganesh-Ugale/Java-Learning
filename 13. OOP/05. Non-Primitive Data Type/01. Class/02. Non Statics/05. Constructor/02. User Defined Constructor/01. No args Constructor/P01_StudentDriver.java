class P01_StudentDriver{
	public static void main(String[] args) {
		
		P01_Student s1 = new P01_Student(); // calling no args constructor in blueprint

		s1.name = "Raju";
		s1.roll = 2343;
		s1.degree = "BE";
		s1.age = 21;
		s1.college = "SVIT College";

		s1.displayStudent();
	}
}
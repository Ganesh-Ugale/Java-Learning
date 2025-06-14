package inheritance.singlelevel;

public class UniCollDriver  {
	public static void main(String[] args) {
//		College(Derived) Object Can Access all the Properties and Behaviors of University(Parent) Class
		College c1 = new College("SPPU","Maharashtra", 123,2003, 50,
				"SVIT", "Nashik", 5, "A++", "Dr. G.B.Shinde", 1998);
		
		c1.displayCollege();
		
		System.out.println("----------------------------------------");
		
		c1.displayUniversity();
		
//		This is Parent Class Object but this can acquire Only the Properties of itself but not Derived class.
		University u1 = new University("SPPU","Maharashtra", 123,2003, 50);
		
		u1.displayUniversity();
//		u1.displayCollege(); // this gives CTE
		
	}
}

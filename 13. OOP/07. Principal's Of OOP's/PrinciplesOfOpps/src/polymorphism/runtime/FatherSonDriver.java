package polymorphism.runtime;

/*
 * Run time polymorphism i.e run time execution the JVM desides which method should executes.
 * The JVM Checks For the new design Created and gives priority to that design or class.
 * This is Known as Method Overriding, This occurs only in Non-static method Run time Poly.
 * 
 * */

public class FatherSonDriver {
	
	public static void main(String[] args) {
		
		Son s1 = new Son();
		s1.finance();
		s1.name();  // This Calls From Son Class even we same method extends from Father.
		
	}
}

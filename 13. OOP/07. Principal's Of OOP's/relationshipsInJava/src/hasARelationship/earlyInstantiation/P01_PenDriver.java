package hasARelationship.earlyInstantiation;

/*
 * This is an Early Instantiation Example where the 1st Refill is created then
   Pen is Created.
   
 * */
public class P01_PenDriver {
	public static void main(String[] args) {
//		Object Creation Statement
		P01_Pen pen1 = new P01_Pen("Tramax", 50d, "Ball Ponter", "Red", "Gel", 0.5d);
		pen1.displayPen();
		
		System.out.println("------------------------------------------");
//		To access the method from Refill class
		pen1.ref.displayRefill();
	}
}

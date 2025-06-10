package hasARelationship.earlyInstantiation;

public class P02_CarDriver {
	public static void main(String[] args) {
		
		P02_Car c1 = new P02_Car("DZIRE", "DD2025", "White", 900000, 6986, 26, "120 km/h");
		
		System.out.println(c1.getBrand());
		System.out.println(c1.engineRef.getBrand());
		
		c1.engineRef.engineDetails("TATA", 5);
		
		c1.displayCarDetails("DZIRE", "DD2025", 6986);
		
		c1.setColor("DZIRE", "White", "Black");
		
		System.out.println(c1.getColor());
	}
}

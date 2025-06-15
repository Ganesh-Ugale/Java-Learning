package inheritance.multiplelevel;

public class AeroplaneDriver {
	
	public static void main(String[] args) {
		
		Sukhoi s1 = new Sukhoi("Aerospace", 400000000, 2, 2000, 2000, 30000,2, 12, 2
				, 2000, "Fighter", "Air", "Sukhoi123", 25, "Yes", "Ruccia", "INDIA");
		
		s1.displayAeroplan();
		
		System.out.println("-------------------------------------------------------------");
		
		s1.displayFighterPlane();
		
		System.out.println("-------------------------------------------------------------");
		
		s1.displaySukhoi();
	}
}

package inheritance.multiplelevel;

public class FighterPlane extends Aeroplane{
	int gen;
	int noOfSeats;
	int range;
	String type;
	String refuelType;
	
	public FighterPlane() {
		// TODO Auto-generated constructor stub
	}

	public FighterPlane(String brand, double price, int engines, int year, int fuelCap, int weight, 
			int passengerCap, int gen, int noOfSeats, int range, String type, String refuelType) {
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelCap = fuelCap;
		this.weight  = weight;
		this.passengerCap = passengerCap;
		
		this.gen = gen;
		this.noOfSeats = noOfSeats;
		this.range = range;
		this.type = type;
		this.refuelType = refuelType;
	}
	
	public void displayFighterPlane() {
		displayAeroplan();
		
		System.out.println("Generation : " + gen);
		System.out.println("noOfSeats : " + noOfSeats);
		System.out.println("Range : " + range);
		System.out.println("Type : " + type);
		System.out.println("Refuel Type : " + refuelType);
		
		
	}
	
	
	
}

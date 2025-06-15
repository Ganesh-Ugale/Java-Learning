package inheritance.multiplelevel;

public class Sukhoi extends FighterPlane{
	
	String model;
	int years;
	String weapons;
	String country;
	String service;
	
	public Sukhoi() {
		// TODO Auto-generated constructor stub
	}
	
	public Sukhoi(String brand, double price, int engines, int year, int fuelCap, int weight, 
			int passengerCap, int gen, int noOfSeats, int range, String type, String refuelType,
			String model, int years, String weapons, String country, String service) {
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
		
		this.model = model;
		this.year = years;
		this.weapons = weapons;
		this.country = country;
		this.service = service;
	}
	
	public void displaySukhoi() {
		displayAeroplan();
		displayFighterPlane();
		System.out.println("Model : " + model);
		System.out.println("Years : " + year);
		System.out.println("Weapons : " + weapons);
		System.out.println("Country : " + country);
		System.out.println("Service : " + service);
	}
}

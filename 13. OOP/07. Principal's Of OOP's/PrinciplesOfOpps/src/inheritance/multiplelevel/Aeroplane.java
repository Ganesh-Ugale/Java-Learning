package inheritance.multiplelevel;

public class Aeroplane {
//	Properties
	String brand;
	double price;
	int engines;
	int year;
	int fuelCap;
	int weight;
	int passengerCap;
	
	public Aeroplane() {
		// TODO Auto-generated constructor stub
	}
	
	public Aeroplane(String brand, double price, int engines, int year, int fuelCap, int weight, 
			int passengerCap) {
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.year = year;
		this.fuelCap = fuelCap;
		this.weight  = weight;
		this.passengerCap = passengerCap;
	}
	
	public void displayAeroplan() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Engines : " + engines);
		System.out.println("Year : " + year);
		System.out.println("Fuel Capacity : " + fuelCap);
		System.out.println("Weight : " + weight);
		System.out.println("Passanger Capacity : " + passengerCap);
	}
}

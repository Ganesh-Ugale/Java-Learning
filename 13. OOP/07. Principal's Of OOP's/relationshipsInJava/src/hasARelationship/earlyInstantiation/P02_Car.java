package hasARelationship.earlyInstantiation;

public class P02_Car {
//	Attributes
	private String brand;
	private String model;
	private String color;
	private double price;
	private int number;
	private int miledge;
	private String topSpeed;
//	Early Binding
	P02_Engine engineRef = new P02_Engine("TATA", 5, "Diesel", 40, "120HP", "Hybrid");
	
//	Parameterized Constructor
	public P02_Car(String brand, String model, String color, double price, int number, int miledge, String topSpeed) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.number = number;
		this.miledge = miledge;
		this.topSpeed = topSpeed;
		
		System.out.println("Car Created!");
	}

	public String getBrand() {
		System.out.print("Car Brand : ");
		return brand;
	}

	public String getModel() {
		System.out.print("Car Model : ");
		return model;
	}

	public String getColor() {
		System.out.print("Car Color : ");
		return color;
	}

	public void setColor(String brand, String oldColor, String newColor) {
		if (this.brand == brand & this.color == oldColor) {
			this.color = newColor;
			System.out.println("\nCar Color Updated!");
		}
		else {
			System.out.println("\nInlvalid Details");
		}
	}

	public double getPrice() {
		System.out.print("Car Price : ");
		return price;
	}

	public int getNumber() {
		System.out.print("Car Number : ");
		return number;
	}

	public void setNumber(String brand, int oldNumber, int newNumber) {
		if (this.brand == brand && this.number == oldNumber) {
			this.number = newNumber;
			System.err.println("Car Number Updated!");
		}
		else {
			System.out.println("Invalid Credentials!");
		}
	}

	public int getMiledge() {
		System.out.print("Car Miledge : ");
		return miledge;
	}

	public String getTopSpeed() {
		System.out.print("Car Top Speed : ");
		return topSpeed;
	}

//	Non static method
	public void displayCarDetails(String brand, String model, int number) {
		if (this.brand == brand && this.model == model && this.number == number) {
			System.out.println("\n-------- Car Details ---------\n");
			System.out.println("Car Brand : " + brand);
			System.out.println("Car Model : " + model);
			System.out.println("Car Color : " + color);
			System.out.println("Car Price : " + price);
			System.out.println("Car Mumber : " + number);		
			System.out.println("Car Miledge : " + miledge);
			System.out.println("Car Top Speed : " + topSpeed);
		}
		else {
			System.out.println("\nInvalid Details");
		}
	}
	
	
	

	
}

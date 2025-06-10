package hasARelationship.earlyInstantiation;

public class P02_Engine {
//	Non-Static Attributes
	private String brand;
	private int engineNum;
	private String fuelType;
	private int fuelCapacity;
	private String power;
	private String type;
	
//	Parameterized Constructor
	public P02_Engine(String brand, int enginNum, String fuelType, int fuelCapacity, String power, String type) {
		this.brand = brand;
		this.engineNum = enginNum;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.power = power;
		this.type = type;
		
		System.out.println("Engine Created!");
	}
	
//	Getter and Setter Methods
	public String getBrand() {
		System.out.print("Brand : " );
		return brand;
	}
	
	public int getEngineNum() {
		System.out.print("Engine Number : " );
		return engineNum;
	}
	
	public String getFuelType() {
		System.out.print("Fuel Type : " );
		return fuelType;
	}
	
	public void setFuelType(String brand, String fuelType, int engineNum) {
		if (brand == this.brand && fuelType == this.fuelType) {
			if (this.engineNum == engineNum) {
				if (engineNum == 1 || engineNum == 2 || engineNum == 3) {
					
					this.fuelType = fuelType;
					System.out.println("Your Fuel Type is Updated!");
				}else {
					System.out.println("Engine Not Matched!!");
				}
			}else {
				System.out.println("Engine Number Not Matched!");
			}
		}else {
			System.out.println("Invalid Credentials!");
		}
	}
	
	public int getFuelCapacity() {
		System.out.print("Fuel Capacity : " );
		return fuelCapacity;
	}
	
	public String getPower() {
		System.out.print("Engine Power : " );
		return power;
	}
	
	public String getType() {
		System.out.print("Engine Type : " );
		return type;
	}
	
//	Prints the Whole Details
	public void engineDetails(String brand, int engineNum) {
		if (this.brand == brand && this.engineNum == engineNum) {
			System.out.println("\n------------ Engine Details ------------\n");
			System.out.println("Engine Brand : " + this.brand);
			System.out.println("Engine Number : " + this.engineNum);
			System.out.println("Fuel Type : " + fuelType);
			System.out.println("Fuel Capacity : " + fuelCapacity);
			System.out.println("Engine Power : " + power);
			System.out.println("Engine Type : " + type);
			
		}
		else {
			System.out.println("\nInvalid Details");
		}
	}
}

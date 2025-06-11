package hasARelationship.lazyInstantiation;

/*
 * Main Class(Service User):
 * This class is not dependent on Sim Object
 * Lazy Instantiation Means: We Create an non-static method and that method is called them when we need.
 * So Only that time the Sim Class object is created.
 * That Method is called as Helper Method 
 * 
 * In the ref Variable Default value is null but when we invoke the simInterted() method in driver class so
   the SIM object is create and ref is stored inside the ref variable inside the mobile class.
 * */

public class P01_Mobile {
//	Attributes
	String brand;
	String name;
	double price;
	String type;
	P01_Sim ref; // This is an Non-Primitive Variable it's Default Value is null.
	
	public P01_Mobile() {
//		no-args Constructor
	}
	
//	Parameterized Constructor
	public P01_Mobile(String brand, String name, double price, String type) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
		
		System.out.println("Mobile Object Created!");
	}
	
	public void insertSim(String sp, String netType, String simType, long simNum) {
//		SIM Object Creation Statement
		ref = new P01_Sim(sp, netType, simType, simNum);
		
		System.out.println("Sim Inserted!");
	}
	
//	non-static Method
	public void displayMobile() {
		System.out.println("Brand : " + brand);
		System.out.println("Name : " + name);		
		System.out.println("Price : " + price);
		System.out.println("Type : " + type);
	}
	
}

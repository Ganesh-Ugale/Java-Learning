/*
Non-Static Methods:
1. Non-Static Methods are Represetns Actions Or Behavours of Object.
2. Methods Declared in the Class Block and we can use var without any ref.
   bcz both are in same class.
   
*/

class P01_Mobile{
	// Attributes OR Properties
	String brand;
	String model;
	float price;
	int rom;
	int ram;
	int cam;

	// Actions OR Behaviours
	public void displayDetails(){
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		System.out.println("RAM : " + ram);
		System.out.println("ROM : " + rom);
		System.out.println("CAM : " + cam);
	}

}
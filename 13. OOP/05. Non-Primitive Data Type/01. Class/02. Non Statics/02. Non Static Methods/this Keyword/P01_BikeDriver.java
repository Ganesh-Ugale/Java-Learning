class P01_BikeDriver{
	public static void main(String[] args) {
		
		System.out.println("----- Object One -----");
		// Object Creation
		P01_Bike bike1 = new P01_Bike();
		System.out.println("bike1 ref var : " + bike1);  // Prints ref of object

		// Assigning a Values to non-static var
		bike1.brand = "KTM";
		bike1.name = "Ducke 120";
		bike1.price = 450000.0f;
		bike1.cc = 150;
		bike1.miledge = 20;

		// Calling a Method
		bike1.displayDetails();
	}
}
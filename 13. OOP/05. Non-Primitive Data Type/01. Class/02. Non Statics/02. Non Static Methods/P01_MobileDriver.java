class P01_MobileDriver{
	public static void main(String[] args) {
		
		// Object Creation!
		System.out.println("\n---- OBJECT ONE ----");
		P01_Mobile m1 = new P01_Mobile();

		m1.brand = "Samsung";
		m1.model = "S24 Ultra";
		m1.price = 125000f;
		m1.ram = 12;
		m1.rom = 512;
		m1.cam = 5;

		m1.displayDetails(); // Calling Actions i.e Method

		// Object Creation!
		System.out.println("\n---- OBJECT TWO ----");
		P01_Mobile m2 = new P01_Mobile();

		m2.brand = "Apple";
		m2.model = "16 Pro";
		m2.price = 150000;
		m2.ram = 16;
		m2.rom = 1;
		m2.cam = 3;

		m2.displayDetails(); // Calling Actions i.e Method

	}
}
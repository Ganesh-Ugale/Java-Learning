class P02_MobileDriver{
	public static void main(String[] args) {

		// Object Created as name iqoo.
		P02_Mobile iqoo = new P02_Mobile();
		System.out.println(iqoo);

		System.out.println("\nIQOO Mobile Specificationsn\n");

		iqoo.brand = "IQOO";
		iqoo.model = "IQOO Z7 Pro";
		iqoo.ram = 12;
		iqoo.rom = 228;
		iqoo.noOfCam = 2;
		iqoo.price = 23500;

		System.out.println("Brand : " + iqoo.brand);
		System.out.println("Model : " + iqoo.model);
		System.out.println("RAM : " + iqoo.ram);
		System.out.println("ROM : " + iqoo.rom);
		System.out.println("No. Of Cameras : " + iqoo.noOfCam);
		System.out.println("Price : " + iqoo.price);

		System.out.println("\n--------------------------------------------");

		// Object Created as name Samsung.
		P02_Mobile samsung = new P02_Mobile();
		System.out.println(samsung);

		System.out.println("\nSamsung Mobile Specificationsn\n");

		samsung.brand = "Samsung";
		samsung.model = "Samsung Galaxy S24";
		samsung.ram = 12;
		samsung.rom = 256;
		samsung.noOfCam = 5;
		samsung.price = 150000;

		System.out.println("Brand : " + samsung.brand);
		System.out.println("Model : " + samsung.model);
		System.out.println("RAM : " + samsung.ram);
		System.out.println("ROM : " + samsung.rom);
		System.out.println("No. Of Cameras : " + samsung.noOfCam);
		System.out.println("Price : " + samsung.price);

		System.out.println("\n--------------------------------------------");
		
		// Object Created as name Apple.
		P02_Mobile apple = new P02_Mobile();
		System.out.println(apple);

		System.out.println("\nApple Mobile Specificationsn\n");

		apple.brand = "Apple";
		apple.model = "iPhone 16 Pro Max";
		apple.ram = 12;
		apple.rom = 256;
		apple.noOfCam = 3;
		apple.price = 165000;

		System.out.println("Brand : " + apple.brand);
		System.out.println("Model : " + apple.model);
		System.out.println("RAM : " + apple.ram);
		System.out.println("ROM : " + apple.rom);
		System.out.println("No. Of Cameras : " + apple.noOfCam);
		System.out.println("Price : " + apple.price);


		System.out.println("\n--------------------------------------------");
		
		// Object Created as name Vivo.
		P02_Mobile vivo = new P02_Mobile();
		System.out.println(vivo);

		System.out.println("\nVivo Mobile Specificationsn\n");

		vivo.brand = "Vivo";
		vivo.model = "Vivo X 100";
		vivo.ram = 8;
		vivo.rom = 128;
		vivo.noOfCam = 4;
		vivo.price = 60000;

		System.out.println("Brand : " + vivo.brand);
		System.out.println("Model : " + vivo.model);
		System.out.println("RAM : " + vivo.ram);
		System.out.println("ROM : " + vivo.rom);
		System.out.println("No. Of Cameras : " + vivo.noOfCam);
		System.out.println("Price : " + vivo.price);
	}
}
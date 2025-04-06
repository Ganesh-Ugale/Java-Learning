class P02_AcDriver{
	public static void main(String[] args) {
	
		
		System.out.println("\n---- Object One ----");
		// Object Creation
		P02_Ac samsungAc = new P02_Ac();

		// Assign the Values using ref var
		samsungAc.brand = "Samsung AC";
		samsungAc.model = "240 Ultra";
		samsungAc.price = 50000.0f;
		samsungAc.minTemp = 17;
		samsungAc.maxTemp = 30;
		samsungAc.ambientTemp = 23;

		// Calling Method Using ref Var
		samsungAc.displayDetails();
		samsungAc.displayAmbientTemp();
		samsungAc.displayMinTemp();
		samsungAc.displayMaxTemp();


		System.out.println("\n---- Object Two ----");
		// Object Creation
		P02_Ac lgAc = new P02_Ac();

		// Assign the Values using ref var
		lgAc.brand = "LG AC";
		lgAc.model = "150 Ultra Pro";
		lgAc.price = 30000.0f;
		lgAc.minTemp = 16;
		lgAc.maxTemp = 30;
		lgAc.ambientTemp = 23;

		// Calling Method Using ref Var
		lgAc.displayDetails();
		lgAc.displayAmbientTemp();
		lgAc.displayMinTemp();
		lgAc.displayMaxTemp();
	}
}
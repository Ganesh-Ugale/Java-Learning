class P02_Ac{
	// Attributes
	String brand;
	String model;
	float price;
	int minTemp;
	int maxTemp;
	int ambientTemp;

	// Actions
	public void displayDetails(){
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}

	public void displayMinTemp(){
		System.out.println("Min Temp : " + minTemp);
	}

	public void displayMaxTemp(){
		System.out.println("Max Temp : " + maxTemp);
	}

	public void displayAmbientTemp(){
		System.out.println("Ambient Temp : " + ambientTemp);
	}
}
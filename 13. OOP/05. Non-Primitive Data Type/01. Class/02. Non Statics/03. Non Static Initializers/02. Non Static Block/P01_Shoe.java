/*
1. In the Non-Static Block, The Block is get's Executed at the time of 
   Object Loading Process.
2. The Non-Static Block is use for Initilize the var OR Server Connecting with DB.
3. THis Block Executed at the Run time, While Constructor loads the Blueprint into 
   Object.
4. This Non-Static Block is Executed Multiple Time while we create a new Object each
   time Unlike Static Block bcz static block is executes only once bcz Class loading is happens only onece but Object Loading is Happens each time when we create Object.
*/

class P01_Shoe{

	// Non Static Var Declaration & Initialization Statements Not All Only 1st
	String brand = "Nike";
	double price ;
	int size;
	String color;

	// Non-Static Block
	{
		System.out.println("\nObject Loading...");
		if (brand.charAt(0) == 'N') {
			price = 1000d;
		}
		else{
			price = 500;
		}
	}

	// Non-Static User Defined Method
	public void displayShoe(){
		System.out.println("\nBrand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Size : " + size);
		System.out.println("Color : " + color);
	}
}
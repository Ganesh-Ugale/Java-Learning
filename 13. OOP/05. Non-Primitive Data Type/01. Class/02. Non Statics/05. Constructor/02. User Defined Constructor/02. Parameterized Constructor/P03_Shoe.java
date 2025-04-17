/*
1. In this program we see the how to object is loading with non-static block.
2. When the Constructor calls like last example Student, now Constructor loading 
   as following way:

   -------- LI STAGE ---------
   i) Declare & Initialization Statement Loading...
   ii) if Only Var Declaration Statement are there so these are loading...
   iii) Non-static user-defined Method Loading...
   iv) Non-Static Block is get Execute Top-to-Bottom Orders...
   -------- UDLI STAGE --------
   v) Constructor Block/body get Executes

3. This Way the Constructor is Loading the Object 
*/

class P03_Shoe{

	// Non-Static Declare & Initialization State & non-static declaration
	String brand = "Reebok";
	double price;
	int size;
	String color;
	String type;

	// Non-Static Block
	{
		System.out.println("\n--------|| Non-Static Block Starts ||--------\n");

		if (brand.charAt(0)=='N') 
		{
			price = 1000d;	
		}
		else
		{
			price = 500d;
		}
  		
  		// Method calling in non-static block
  		displayShoe();

		System.out.println("\n--------|| Non-Static Block Ends ||--------\n");
	}


	// no-args constructor
	P03_Shoe()
	{
		System.out.println("\n--------|| no-args Constructor UDIL Block Starts ||--------\n");

		System.out.println("Object Loading...");

		System.out.println("\n--------|| no-args Constructor UDIL Block Ends ||--------\n");

	}

	// parameterized Constructor
	P03_Shoe(double price, int size, String type, String color)
	{
		System.out.println("\n--------|| Para Constructor UDIL Block Starts ||--------\n");
		System.out.println("Object Loading... & Value Assined");
		this.price = price;
		this.size = size;
		this.type = type;
		this.color = color;

		System.out.println("\n--------|| Para Constructor UDIL Block Ends ||--------\n");

	}

	// Non-static user-defined methods
	public void displayShoe()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Size : " + size);
		System.out.println("Color : " + color);
		System.out.println("Type : " + type);
	}

}
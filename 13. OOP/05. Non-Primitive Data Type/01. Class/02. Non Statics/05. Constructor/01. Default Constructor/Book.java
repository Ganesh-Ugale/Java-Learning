/*
1. In this Class name Book, this is a Blueprint class of Object Book.
2. We Not added any constructor in the blueprint but still the 
   driver class contructor is called How?
3. bcz when the programmer fails to add the constructor in blueprint
   class so javac compiler add a default constructor at compile time.
4. javac compiler adds an default constructor in blueprint class at 
   compile time and generates a .class file.

NOTE: in any program the construtor is mandatory to add by programmer.

5. When programmer adds a constructor so this constructor is called 
   as no-argument constructor or Parameterized constructor.

6. When javac compiler adds a constructor so that time is called as 
   no args constructor OR default constructor.
*/

class Book{

	// non-static variable declarations
	String brand;
	double price;
	String color;
	int noOfPages;

	// non-static user-defined method
	public void displayBook()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Color : " + color);
		System.out.println("No. of Pages : " + noOfPages);
	}
}
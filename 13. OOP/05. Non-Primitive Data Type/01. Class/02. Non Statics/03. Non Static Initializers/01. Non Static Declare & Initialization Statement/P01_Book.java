/*
1. In the Non-Static Declare & Initialization Statement is we can declare 
   a var and initializa simultaneously.
*/

class P01_Book{

	// This is an Declare & Initializaiton Statement
	String brand = "Classmate";
	int price = 1000;

	public void displayBook(){
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}
}
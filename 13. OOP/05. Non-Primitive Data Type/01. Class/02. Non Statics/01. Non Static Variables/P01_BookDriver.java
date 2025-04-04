/*
1. Using one Blueprint of Object we can create a any number of objects.
2. Each Object is created at different memory locations.
3. Each Object Creation is allocate the new Memory Locations.
*/

class P01_BookDriver{
	public static void main(String[] args) {

		P01_Book b1 = new P01_Book();  // P01_Book Object Created!
		System.out.println(b1); // Printing Address or Referance.

		// Variables Initialize inside the main() Method.
		/* Using Object referance var and attribute name we can put the data into that var.*/
		b1.brand = "Classmate";
		b1.price = 50.0;
		b1.noOfPages = 150;
		b1.type = "Long Notebook";
		b1.weight = 200;
		b1.bound = "Soft Bound";

		System.out.println("Brand : " + b1.brand);
		System.out.println("Price : " + b1.price);
		System.out.println("No. Of Pages : " + b1.noOfPages);
		System.out.println("Type : " + b1.type);
		System.out.println("Weight : " + b1.weight);
		System.out.println("Bound : " + b1.bound);

		System.out.println("---------------------------------------------");
	
		P01_Book b2 = new P01_Book(); // Object Created!
		System.out.println(b2);

		System.out.println("Brand : " + b2.brand);
		System.out.println("Price : " + b2.price);
		System.out.println("No. Of Pages : " + b2.noOfPages);
		System.out.println("Type : " + b2.type);
		System.out.println("Weight : " + b2.weight);
		System.out.println("Bound : " + b2.bound);

		/* Here the b1 and b2 Varibales are not same*/
	}
}
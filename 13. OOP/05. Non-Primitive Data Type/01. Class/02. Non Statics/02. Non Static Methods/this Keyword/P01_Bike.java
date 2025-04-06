/*
1. Using "this" Keyword OR Ref var we can access the non-static class members.
2. "this" Keyword is used when local var and non-static var having same name.
3. Using "this" keyword ref we can access the non-static var First.

4. If we Print the referance stored in the "this" keyword and referance var(non-static var) so both having same value i.e same referance
*/

class P01_Bike{
	// Attributes
	String brand;
	String name;
	float price;
	int cc;
	int miledge;

	// Actions
	public void displayDetails(){

		String name = "Chapri Bike"; // This Local Var Calls First bcz its high priority.

		System.out.println("Brand : " + brand);
		System.out.println("Name : " + name);
		// using this keyword/ ref var the non-static member of class is accessed first.
		System.out.println("Name : " + this.name); 
		System.out.println("this ref var: " + this); // prints ref of object
		System.out.println("Price : " + price);
		System.out.println("CC : " + cc);
		System.out.println("Miledge : " + miledge);
	}
}
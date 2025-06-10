package hasARelationship.earlyInstantiation;

/*
 * This is Main Class OR Service user (Pen): 
 * 
 * This Class Creates an Object of Pen then Automatically Refill Object is Created
   & ref is stored inside pen object.
   
 * This Design we can achieve with non-static Initializers & Constructors:
   - In Non-static Initializers we can design this method in 2 ways using:
   		- i) Using Non-static Declaration & Initialization
   		  ii) Using Non-static Block(Using Scanner Class)
   - and third way is using in the Constructor Body
 * 
 * */

import java.util.Scanner;
public class P01_Pen {
//	Attributes
	String brand;
	double price;
	String type;
//	1st Way of Early Instantiation in non static declare & Initialization Statement
//	P01_Refill ref = new P01_Refill("Red", "Ball Pointer", 50d);
	
//	3rd Way of Early Instantiation in the constructor body
	P01_Refill ref; 
	
//	2nd Way of Early Instantiation in non static Block(Using Scanner class)
//	P01_Refill ref;
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the Color of Refill : ");
//		String color = sc.nextLine();
//		
//		System.out.print("Enter the Type of Refill : ");
//		String type = sc.nextLine();
//		
//		System.out.print("Enter the Price of Refill : ");
//		double price = sc.nextDouble();
//		
//		ref = new P01_Refill(color, type, price);
//	}
	
	
//	no-args Constructor
	public P01_Pen() {
		
	}
	
//	Parameterized Constructor
	
	
	public P01_Pen(String brand, double price, String type, String color,
			String refType, double refPrice) {
//		This is 3rd Way of Creating an Dependent class Object in main class
		ref = new P01_Refill(color, refType, refPrice);
		
		this.brand = brand;
		this.price = price;
		this.type = type;
		
		System.out.println("Pen Object Created!");
	}
	
//	Non-static Method to access the attributes of Pen class
	public void displayPen() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Type : " + type);
	}
}

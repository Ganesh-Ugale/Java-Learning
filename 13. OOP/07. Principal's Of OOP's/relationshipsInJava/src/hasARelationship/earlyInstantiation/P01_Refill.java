/*
 * This is an Dependent class(Refill):
 * 
* 
 * */

package hasARelationship.earlyInstantiation;

public class P01_Refill {
//	Attributes
	String color;
	String type;
	double size;

//	Constructor
	public P01_Refill(String color, String type, double size) {
		this.color = color;
		this.type = type;
		this.size = size;
		
		System.out.println("Refill Inserterd!");
	}
	
//	Non-static Method to access the attributes of Refill class
	public void displayRefill() {
		System.out.println("Color : " + color);
		System.out.println("Type : " + type);
		System.out.println("Size : " + size);
	}
}

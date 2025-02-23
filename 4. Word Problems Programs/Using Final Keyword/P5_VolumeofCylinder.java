/*Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:

area = 3.14 * radius * radius
volume = area * height
*/


import java.util.Scanner;

class VolumeOfCylinder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a radius: ");
		float radius = sc.nextFloat();
		System.out.print("Enter a height: ");
		float height = sc.nextFloat();

		// Calculate Area of Cylinder OR Area of Circle
		final float pi = 22f/7f; // final keyword use here
		float area = pi*(radius*radius);

		// Calculate Volume of Cylinder
		float volume = area * height;

		System.out.println("Area of Cylinder is: " + area + " cm^2");
		System.out.println("Volume of Cylinder is: " + volume + " cm^2");		

	}
}
/*
 Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula:

 area = width * height
 */



import java.util.Scanner;

class Area_PerimeterOfRectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Length of Rectangle: ");
		float length = sc.nextFloat();

		final float width = 4.5f; // final keyword used here
		final float height = 7.9f; // final keyword used here

		// Calculate the Area of Circle
		float area = width * height;
		System.out.println("Area of Rectangle is: " + area);

		// Calculate the Perimeter of Rectangle
		float perimeter = (length + width) * 2;
		System.out.println("Perimeter of Rectangle is: " + perimeter);
	}
}
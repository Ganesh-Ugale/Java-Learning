/*
 Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result.
The formula for the conversion is as follows:

Fahrenheit = (9 / 5) * celsius + 32

Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8."
 */


import java.util.Scanner;

class CelciusToFahrehnite
{
	public static void main(String[] args)
	{
		// Celcius to Fernhite Conversion
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celcius: ");
		double celcius = sc.nextDouble(); // We can also use float
		final double cons = 9/5;
		double fahrenhite = (cons) * celcius + 32; // d is mendatory othewise the answer will be change
		System.out.println(celcius + " Celcius is " + fahrenhite + " fahrenhite");
	}
}
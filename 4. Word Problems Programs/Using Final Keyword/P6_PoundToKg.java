/*
Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilograms.
 */



import java.util.Scanner;

class PoundToKg
{
	public static void main(String[] args)
	{
		System.out.print("Enter a num in Pound: ");
		float userPounds = new Scanner(System.in).nextFloat();

		final float onePound = 0.454f; // One pound value

		float poundsToKg = userPounds * onePound; // Pounds to Kg Conversion.

		System.out.println(userPounds + " pounds is equals to " + poundsToKg + " Kilograms");
	}
}
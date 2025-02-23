/*
 * Write an Program to Find the Body Mass Index (BMI) form user weight in pounds and height in inches
 */

import java.util.Scanner;

class Bmi
{
	public static void main(String[] args)
	{
		System.out.println("Enter the weight in pounds : ");
		float userWeight = new Scanner(System.in).nextFloat();
		System.out.println("Enter the height in inches : ");
		float userHeight = new Scanner(System.in).nextFloat();
		
		final float onePound = 0.45359237f;

		float weightInKg = (userWeight * onePound);

		final float oneInch = 0.0254f;

		float heightInmeter = userHeight * oneInch;

		float Bmi = weightInKg / (heightInmeter * heightInmeter);

		System.out.println("BMI is: " + Bmi);
		
	}
}
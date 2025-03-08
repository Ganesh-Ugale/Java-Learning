/*
Make a Mini Application of IncomeTaxCalculator
*/

import java.util.Scanner;
class IncomeTaxCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		float taxRates = 0;

		System.out.println("\n========================|| WELCOME ||========================");
		System.out.print("\nEnter Your Income : ");
		float income = sc.nextFloat();

		if (income >= 0 && income <= 400000)
		{
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nNo Charge on Your Income Rs : " + income + " Enjoy!");
		}
		else if (income > 400000  && income <= 800000)
		{
			taxRates = 5;
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nCharge on your income Rs " + income + " is : " + ((income*taxRates)/100));
		}
		else if (income > 800000 && income <= 1200000)
		{
			taxRates = 10;
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nCharge on your income Rs " + income + " is : " + ((income*taxRates)/100));
		}
		else if (income > 1200000 && income <= 1600000)
		{
			taxRates = 15;
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nCharge on your income Rs " + income + " is : " + ((income*taxRates)/100));
		}
		else if (income > 1600000 && income <= 2000000)
		{
			taxRates = 20;
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nCharge on your income Rs " + income + " is :" + ((income*taxRates)/100));
		}
		else if (income > 2000000 && income <= 2400000)
		{
			taxRates = 25;
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nCharge on your income Rs " + income + " is : " + ((income*taxRates)/100));
		}
		else if (income > 2400000)
		{
			taxRates = 30;
			System.out.println("\nTax : " + taxRates + "%");
			System.out.println("\nCharge on your income Rs " + income + " is : " + ((income*taxRates)/100));
		}
		else
		{
			System.out.println("INVALID INCOME");
		}
		System.out.println("\n------------------------> Thank You! <------------------------");
	}
}
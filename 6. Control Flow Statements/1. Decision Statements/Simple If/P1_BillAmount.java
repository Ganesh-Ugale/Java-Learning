/*
 * Write an Program of Bill Amount Using Simple if Statement
 */

import java.util.Scanner;

class BillAmount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Amount: ");
		float amount = sc.nextFloat();

		System.out.println("Have a Good Day!");

		if(amount>=3000)
		{
			amount-=(3000*0.1);
		}

		System.out.print("Payable Billing Amount is: " + amount);
	}
}
/*
 * Check the user entered char is a Digit or Not
 */

import java.util.Scanner;

class DigitsCheck
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Digit : ");
		char ch = new Scanner(System.in).next().charAt(0);

		String op = (ch>='0' && ch<='9')?(ch + " is a digit"):(ch + " is not a digit");
		System.out.println(op);
	}
}
/*
 * Check the Entered Char is LowerCase Or UpperCase Using Ternary Operator
 */

import java.util.Scanner;

class LowerCaseCheck
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Char : ");
		char ch = new Scanner(System.in).next().charAt(0);

		String op = (ch>='a' && ch<='z')?(ch+ " char is LoweCase"):(ch+ " char is not LoweCase");
		System.out.println(op);
	}
}
/*
 * Write an Program to Check the user Entered Char is Upper Case or Not
 */
import java.util.Scanner;

class UpperCaseCheck
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Char : ");
		char ch = new Scanner(System.in).next().charAt(0);

		String op = (ch>='A' && ch<='Z')?("The char is UpperCase"):("The char is not UpperCase");
		System.out.println(op);
	}
}
/*
 * ASCII Code Prints Using the if else Statement
 */

import java.util.Scanner;
class AsciiCodePrint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n ==============================|| ASCII CODE PRINTING ||==============================\n");
		System.out.print("\nEnter the Char : ");
		char ch = sc.next().charAt(0);

		if (ch>=0 && ch<=127)
		{
			int value = ch;
			System.out.println("\nASCII Value of Char | " + ch +" | is " + value);
		}
		else{
			System.out.println("\nINVALID CHAR");
		}

	}
}
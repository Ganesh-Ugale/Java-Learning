 /*
 * Upper Case, Lower Case & Special Char Check using Ternary Operator
 */

import java.util.Scanner;

class UCaseLCaseDigitSpeChCheck
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Char: ");
		char ch = new Scanner(System.in).next().charAt(0);

		String op = (ch>='A' && ch<='Z')?(ch+ " is UpperCase Char"):((ch>='a' && ch<='z')?(ch+ " is LoweCase Char"):((ch>='0' && ch<='9')?(ch+ " is a Digit"):(ch+ " is a Special Char")));
		System.out.println(op);
	}
}
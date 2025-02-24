/*
 * Check the User Entered Char is Vowel or Not Using Ternary Operator
 */

import java.util.Scanner;

class Vowels
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Char : ");
		char ch = new Scanner(System.in).next().charAt(0);

		String op = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?(ch+" Char is Vowel"):(ch+" Char is Not a Vowel");
		System.out.println(op);
	}
}
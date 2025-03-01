/*
 * Write a Program to Print the Alphabets Upper case and Lower Case Using While Loop
 */

import java.util.Scanner;
class AlphabetsPrint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n ==============================|| ALPHABETS PRINTING ||==============================\n");
		
		System.out.println("1. For Upper Case Alphabest(A) : ");
		System.out.println("2. For Lower Case Alphabest(a) : ");
		System.out.print("\nSelect Option(A/a) : ");
		char alphabet = sc.next().charAt(0);

		while ((alphabet>='a' && alphabet<='z') || (alphabet>='A' && alphabet<='Z'))
		{
			System.out.println("Alphabet : " + alphabet);
			alphabet++;
		}
	}
}
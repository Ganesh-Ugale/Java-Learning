/*
 * Print the Numbers from 1 to upto user wants
 */

import java.util.Scanner;
class NumbersPrint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\n ==============================|| NUM PRINTING ||==============================\n");

		System.out.print("\nEnter num you want to print upto : ");
		int num = sc.nextInt();

		int i = 1; // Initialization Statement
		while (i<=num) // Condition to control the loop
		{
			System.out.println(" | " + i + " | ");
			i++; // Updation helps to achive the condition OR it makes the conidition becomes false
		}
		System.out.println("\n+----------+----------+----------|| Thank You! ||+----------+----------+----------");
	}
}
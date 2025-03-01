/*
 * Prints the ASCII Table Char From to Using the While Loop
 */

import java.util.Scanner;
class AsciiTablePrint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Start ASCII Value : ");
		int valStart = sc.nextInt();
		System.out.print("Enter End ASCII Value : ");
		int valEnd = sc.nextInt();
		
		while (valStart<=valEnd)
		{
			System.out.println(valStart + " : " + (char)valStart);
			valStart++;
		}
	}
}
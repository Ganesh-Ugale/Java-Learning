/*
 * Check Whether Which is the Smallest Num among 3 num's
 */

import java.util.Scanner;

class SmallestNum
{
	public static void main(String[] args)
	{
		System.out.print("Enter Num1: ");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("Enter Num2: ");
		int num2 = new Scanner(System.in).nextInt();
		System.out.print("Enter Num3: ");
		int num3 = new Scanner(System.in).nextInt();

		int smallest = (num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3));
		System.out.println("Smallest Num is: " + smallest);
		
	}
}
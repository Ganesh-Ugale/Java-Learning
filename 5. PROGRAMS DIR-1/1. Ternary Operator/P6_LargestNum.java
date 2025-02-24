/*
 Find the Largest Num Among 4 Nums Using Ternary Operator
 */

import java.util.Scanner;

class LargestNum
{ 
	public static void main(String[] args)
	{
		System.out.print("Enter Num1: ");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("Enter Num2: ");
		int num2 = new Scanner(System.in).nextInt();
		System.out.print("Enter Num3: ");
		int num3 = new Scanner(System.in).nextInt();
		System.out.print("Enter Num4: ");
		int num4 = new Scanner(System.in).nextInt();


		int largest = (num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3)); // for 3 digit num
		int largest = (num1>num2)?((num1>num3)?((num1>num4)?(num1):(num4)):((num3>num4)?(num3):(num4))):((num2>num3)?((num2>num4)?(num2):(num4)):((num3>num4)?(num3):(num4))); // for 4 digit num
		System.out.println("Largest Num is: " + largest);
	}
}
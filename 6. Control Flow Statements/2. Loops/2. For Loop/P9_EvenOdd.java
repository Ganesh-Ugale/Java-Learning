/*
Print the Even Odd Digits using For Loop 
 */

import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Start Num : ");
		int num = sc.nextInt();
		System.out.print("\nEnter Range of Even/Odd Num : ");
		int range = sc.nextInt();
		System.out.print("\nODD   | EVEN");
		for (   ; num <= range; num++ )
		{
			if (num % 2 == 0)
			{
				System.out.print("   |   " + num + " ");
			}
			else{
				System.out.print("\n " + num + " ");
			}
		}
	}
}
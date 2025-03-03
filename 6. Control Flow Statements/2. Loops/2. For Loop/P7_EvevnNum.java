// Program to Print the Even Num using for Loop

import java.util.Scanner;
class EvenNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Start Num : ");
		int num = sc.nextInt();
		System.out.print("\nEnter Range of Even Num : ");
		int range = sc.nextInt();
		System.out.print("\nEven Num's ");
		for (   ; num <= range; num++ )
		{
			if (num % 2 == 0)
			{
				System.out.print("| " + num + " ");
			}
		}
	}
}
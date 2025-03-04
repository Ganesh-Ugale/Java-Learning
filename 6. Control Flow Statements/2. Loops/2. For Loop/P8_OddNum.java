/*
Print the Odd Num from user enterd range using for loop
 */

import java.util.Scanner;
class OddNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Max Range of Odd Num : ");
		int range = sc.nextInt();
		System.out.print("\nEnter Min range of Odd Num : ");
		int num = sc.nextInt();
		System.out.print("\nOdd Num's ");

		for (  ; range>=num ; range-- )
		{
			if (!(range % 2 == 0))
			{
				System.out.print("|" + range + " ");
			}
		}
	}
}
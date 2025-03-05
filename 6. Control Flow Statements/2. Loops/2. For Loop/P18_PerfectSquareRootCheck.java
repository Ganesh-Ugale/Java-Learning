/*
Check Wheter the num has Perfect Square root or Not
Ex:
Input Num = 4 OR 5
Output = 2 is a perfect Square root of num 4 OR Num has No perfect Square root.
*/

import java.util.Scanner;
class PerfectSquareRootCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| FIND PERFECT SQUARE ROOT ||============================");
		System.out.print("\nEnter Num : ");
		int num = sc.nextInt();
		boolean flag = false; // We use flag for if the num has no perfect square root

		for (int i = 1; i<=num; i++) // Loop iterates 1 to num of times
		{
			if (i * i == num) // Check the i * i == num or Not if yes then execute the statements
			{
				flag = true; // if Condition true then flaf changes from flase to true
				System.out.println("\nThe Perfect Square root of Num " + num + " is " + i);
			}
			else if (i * i> num) // it saves the time for execution bcz if i * i value is goes greater than num so that is the num has obiously no perfect sqrt root so loop breaks
			{
				break;
			}
		}

		if (!flag) // if above if condition becomes false so flag changes flase to true here and if block executes
		{
			System.out.println("\nThe Num " + num + " has No Perfect Square root!");
		}
	}
}
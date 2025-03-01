/*
 * Sum of Digits Using While Loop
 */

import java.util.Scanner;
class SumOfNum
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num : ");
		int num = sc.nextInt(); // Initialization

		int rem, sum = 0, dup = num;
		while (num>0) // condition
		{
			rem = num % 10; // to get the num
			sum += rem;  // to Store
			num /= 10; // Update
		}
		System.out.print("Sum of Num " + dup + " is : " + sum);
	}
}
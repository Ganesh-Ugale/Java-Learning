/*
Find the Largest Digit from input num.
input = 4562831;
output = 1;
*/

import java.util.Scanner;
class FindSmallestNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int min = 9; // initially the min is 9

		for (int i = num; i > 0 ; i /=10 ) // for update the num
		{
			int digit = i % 10; // To fetch the last digit from num
			if (min > digit) // compare the min > digit if digit is smaller then the min so assign the digit to min
			{
				min = digit; // assign the smallest num to min
			}
		}
		System.out.println("\nSmallest Num from " + num + " is " + min);
	}
}
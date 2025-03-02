/*
To Find the sum of Odd Digits Factorials Only
Ex: 
Input Num = 1234
factorial = 1x2x3x4
Sum = 1+3
Output = 4
*/

import java.util.Scanner;
class SumOfOddFactorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF ODD FACTORAL DIGIT ||============================");
		System.out.print("\nEnter Num : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;

		while (num>0) // to Check & update the num and sum
		{
			int rem = num % 10; // fetch only one last num
			int fact = 1; // each time reset the fact bcz the loops each time comes from above
			
			if (rem % 2 != 0) // To check the Num is Odd or Not
			{
				for (int i = rem; i >= 1 ; i-- ) // To calculate the rem num Factorial loop iterate num of times
				{
					fact *= i; // Calculate the factorial & add in the fact var
				}
				sum += fact; // Sum of Factorial num
			}
			num /= 10; // Update the Num
		}
		System.out.println("Sum of Odd Num Digits of Factorial: " + sum);
	}
}
/*
Sum of Digits using While Loop
Ex:
num = 1234
Sum = 1+2+3+4
Output: Sum = 10
*/

import java.util.Scanner;
class SumofDigits 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF DIGITS ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int sum = 0, dup = num;

		while (num > 0)
		{
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("Sum of Digits " + dup + " is : " + sum);
	}
}
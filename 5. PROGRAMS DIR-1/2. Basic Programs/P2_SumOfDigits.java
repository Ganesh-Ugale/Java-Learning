/*
 * Program to Take a Sum of 4 Digits Nums
 */

import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args)
	{
		System.out.print("Enter a 4 Digit Num: ");
		int userNum = new Scanner(System.in).nextInt();
		
		int dup = userNum;
		int sum = 0;
		int lastNum;
		
		// Iteration- 1
		lastNum = userNum%10; // return the last digit
		sum = sum + lastNum; // Store the old sum + lastNum
		userNum = userNum/10; // remove the last Num i.e Update the userNum

		// Iteration- 2
		lastNum = userNum%10;
		sum = sum + lastNum;
		userNum = userNum/10;

		// Iteration- 3
		lastNum = userNum%10;
		sum = sum + lastNum;
		userNum = userNum/10;

		// Iteration- 4
		lastNum = userNum%10;
		sum = sum + lastNum;
		userNum = userNum/10;

		System.out.println("Sum of 4 digits num is: " + sum);		

	}
}
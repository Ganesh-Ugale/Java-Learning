/*
 Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14
*/


import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args)
	{
		System.out.print("Enter a num between 0 & 999: ");
		int userNum = (new Scanner(System.in).nextInt());

		int dup = (userNum > 0) ? (userNum) : (0); // First Check num is a +ve Value or Not
		userNum = (dup<1000)?(dup):(0); // Check the Num is less than 100 or Not

		int sum = (userNum % 10); // to add the last num
		
		userNum = (userNum / 10); // to remove the last num
		sum = sum + (userNum%10); // old num + last num
		
		userNum = (userNum / 10); // remove the last num
		sum = sum + (userNum % 10); // old num + last num

		System.out.println("The Sum of the Digits is: " + sum);

// this will print the final output

	}
}
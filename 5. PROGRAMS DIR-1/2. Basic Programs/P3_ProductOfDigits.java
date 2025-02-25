/*
	Write an Program to Take the Products of Digits Using Ternary Operator
 */

import java.util.Scanner;

class ProductOfDigits
{
	public static void main(String[] args)
	{
		System.out.println("Enter 4 Digit Num: ");
		int userNum = new Scanner(System.in).nextInt();

		int lastNum, prod = 1;

		// Iteration- 1
		lastNum = userNum % 10; // return last digit
		prod = prod * lastNum; // product and store 
		userNum = userNum / 10; // remove last digit
	
		// Iteration- 2
		lastNum = userNum % 10;
		prod = prod * lastNum;
		userNum = userNum / 10;
	
		// Iteration- 3
		lastNum = userNum % 10;
		prod = prod * lastNum;
		userNum = userNum / 10;

		// Iteration- 4
		lastNum = userNum % 10;
		prod = prod * lastNum;
		userNum = userNum / 10;

		System.err.println("Products of Digits is: " + prod);
	}
}
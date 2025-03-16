/*
To Check Whether the Entered ISBN num is Valid ISBN or Not!

Hint: ISBN Num Check Rule--> if num is 10 digit so mod by 11, if num is 13 digit so mod by 10.
Here we use only 10 digit num so mod by 11 only.

Ex: I/P= 1259060977
Calculation = (7x1)+(7x2)+(9x3)+(0x4)+.......+(1x10)
sum % 11 == 0
O/P: it is Valid ISBN Number!
*/

import java.util.Scanner;
class P03_ISBNNumCheck{
	public static void main(String[] args) {
		System.out.print("\nEnter the ISBN : ");
		long num = new Scanner(System.in).nextLong();
		int sum = 0; 

		// To Fetch digit from last one by one and Multiply each digit by it's Position
		for (long i = num, j = 1; i > 0; i /= 10, j++) { 
			long rem = i % 10;

			sum += (rem * j); // Multiply each digit by it's Position.
		}

		System.out.println // if the sum is divisible by 11 so it is a ISBN
		(sum%11 == 0 ? num + " is valid ISBN Num!" : num + " is not valid ISBN Num!");
	}
}
/* ## Cognizant Technical Round Question
 To Check Whether the Entered Num is Tech Num or Not
 Ex: I/P = 2025
 	 Calculation = 20 + 25 = 45^2 = 2025
 	 if sqrt == num
 	 O/P = 2025 is Tech Num! */

import java.util.Scanner;
class P3_TechNumCheck{
	public static void main(String[] args) {
		System.out.print("\nEnter the Num : ");
		int num = new Scanner(System.in).nextInt();
		int len = 0, din = 1, sum = 0;

		// Count the len of Num
		for (int i = num; i > 0; i /= 10) { 
			len++;
		}

		if (len%2 == 0) {
			// to divide num into 2 equal parts so deside how much the dinominator set.
			for (int i = 1; i <= (len/2); i++) { 
				din *= 10;
			}	
			
			sum = (num/din) + (num%din); // Divide into 2 Equal parts & Sum
			int sqrt = sum * sum; // to find the Square of sum
			System.out.println  // if sqrt == num
			(sqrt == num ? num + " is a TECH Num!" : num + " is not Tech Num!");
		}
		else
			System.out.println(num + " is Not TECH Num!");
	}
}
/*
A Buzz Number is a number that is divisible by 7 or ends with the digit 7.
Example:
49 → Divisible by 7 ✅ (Buzz Number)
17 → Ends with 7 ✅ (Buzz Number)
23 → Neither divisible by 7 nor ends with 7 ❌ (Not a Buzz Number)

*/

import java.util.Scanner;
class P05_BuzzNumCheck{
	public static void main(String[] args) {


		// for (int num = 1; num <= 1000; num++){  // Extra Loop for checking num 1 to 1000
		System.out.print("\nEnter the num : ");
		int num = new Scanner(System.in).nextInt();

			int rem = 0;

			if (num%7 == 0) {  // Checking Num is divisible by 7 or not
				System.out.println(num + " is a Buzz Num!");
			}
			else{  // else check the last digit of num is 7 or Not
				for (int i = num; i > 0; i /= 10) {
					rem = i % 10;
					break;  // Only Fetch the Last one digit
				}
				if (rem == 7) // Check last digit is == 7 or Not 	
					System.out.println(num + " is a Buzz Num!");
				else
					System.out.println(num + " is not Buzz Num!");
			}
		// } // Extra Loop Ends
	}
}
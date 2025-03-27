/*
A Phloem Number is a number where the sum of the first and last digit is not equal to the sum of the middle digits.

Example:
Consider 101

First + Last Digit = 1 + 1 = 2
Middle Digit Sum = 0
Since 2 ≠ 0, 101 is a Phloem Number
Phloem numbers are simply the opposite of Xylem Numbers, meaning they do not satisfy the Xylem condition.
*/

import java.util.Scanner;
class P21_PhloemNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(num + " is Phloem num? : " + isPhloem(num));
	}
	// METHODS
	public static boolean isPhloem(int num){
		int sumExt = num % 10; // fetch the last digit
		num /= 10; // remove the last digit
		int sumMid = 0; // initially mid digits sum is 0
		while (num > 10){ // if num > 10 then executes block
			sumMid += num % 10; // fetch the last digit
			num /= 10; // remove the last digit
		}
		sumExt += num; // add the remaining last didit in sumExt
		return sumExt != sumMid; // checks both are equal?
	}
}



// Print the Phloem Num in Range from 1 to 1000

// class P21_PhloemNumCheck{
// 	public static void main(String[] args) {
		
// 		for (int i = 1; i <= 1000; i++)
// 			if (isPhloem(i))
// 				System.out.print(i + " ");
// 	}
// 	// METHODS
// 	public static boolean isPhloem(int num){
// 		int sumExt = num % 10; // fetch the last digit
// 		num /= 10; // remove the last digit
// 		int sumMid = 0; // initially mid digits sum is 0
// 		while (num > 10){ // if num > 10 then executes block
// 			sumMid += num % 10; // fetch the last digit
// 			num /= 10; // remove the last digit
// 		}
// 		sumExt += num; // add the remaining last didit in sumExt
// 		return sumExt != sumMid; // checks both are equal?
// 	}
// }
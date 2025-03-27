/*
A Xylem Number (also called an Outer-Digit Sum Number) is a number where the sum of the first and last digits (outer digits) is equal to the sum of all middle digits (inner digits).

Example:
✅ Xylem Number: 25182

Outer digits: 2 + 2 = 4
Inner digits: 5 + 1 + 8 = 4
Since outer sum = inner sum, it's a Xylem Number.
💡 Key Point: If outer digit sum = inner digit sum, it's a Xylem Number, otherwise, it's a Phloem Number! 🚀
*/

import java.util.Scanner;
class P20_XylemNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(num + " is Xylem num? : " + isXylem(num));
	}
	// METHODS
	public static boolean isXylem(int num){
		int sumExt = num % 10; // fetch the last digit
		num /= 10; // remove the last digit
		int sumMid = 0; // initially mid digits sum is 0
		while (num > 10){ // if num > 10 then executes block
			sumMid += num % 10; // fetch the last digit
			num /= 10; // remove the last digit
		}
		sumExt += num; // add the remaining last didit in sumExt
		return sumExt == sumMid; // checks both are equal?
	}
}



// Print the Xylem Num in Range from 1 to 1000

// class P20_XylemNumCheck{
// 	public static void main(String[] args) {
		
// 		for (int i = 1; i <= 1000; i++)
// 			if (isXylem(i))
// 				System.out.print(i + " ");
// 	}
// 	// METHODS
// 	public static boolean isXylem(int num){
// 		int sumExt = num % 10; // fetch the last digit
// 		num /= 10; // remove the last digit
// 		int sumMid = 0; // initially mid digits sum is 0
// 		while (num > 10){ // if num > 10 then executes block
// 			sumMid += num % 10; // fetch the last digit
// 			num /= 10; // remove the last digit
// 		}
// 		sumExt += num; // add the remaining last didit in sumExt
// 		return sumExt == sumMid; // checks both are equal?
// 	}
// }
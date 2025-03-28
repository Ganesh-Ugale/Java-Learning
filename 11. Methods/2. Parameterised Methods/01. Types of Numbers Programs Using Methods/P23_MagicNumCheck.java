/*
A Magic Number is a number where the sum of its digits is calculated repeatedly until a single-digit is obtained, and that single-digit is 1.

Example:
Consider 1729

1 + 7 + 2 + 9 = 19
1 + 9 = 10
1 + 0 = 1 → Since the final sum is 1, 1729 is a Magic Number.
If the final sum is not 1, then the number is not a Magic Number.
*/

import java.util.Scanner;
class P23_MagicNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println(num + " is Magic num? : " + isMagic(num));
	}
	// METHODS
	public static boolean isMagic(int num){
		int sum = num;  // 1st assign he num to sum
		while (sum > 9) {  // Check sum > 9
			int temp = sum;  // if yes then assign the sum to temp
			sum = 0;  // reset the sum
			while (temp > 0) {   // check temp > 0
				sum += temp % 10; // add last digit in sum
				temp /= 10;  // remove again last digit
			}
		}
		return sum == 1;  // return true if sum == 1, otherwise false
	}
}


// To print the range of magic num from 1 to 1000


// class P23_MagicNumCheck{
// 	public static void main(String[] args) {

// 		// Print the num from 1 to 1000
// 		for (int i = 1; i <= 1000; i++)
// 			if (isMagic(i))
// 				System.out.print(i + " ");
// 	}
// 	// METHODS
// 	public static boolean isMagic(int num){
// 		int sum = num;  // 1st assign he num to sum
// 		while (sum > 9) {  // Check sum > 9
// 			int temp = sum;  // if yes then assign the sum to temp
// 			sum = 0;  // reset the sum
// 			while (temp > 0) {   // check temp > 0
// 				sum += temp % 10; // add last digit in sum
// 				temp /= 10;  // remove again last digit
// 			}
// 		}
// 		return sum == 1;  // return true if sum == 1, otherwise false
// 	}
// }
/* To Check Whether the given num is Neuon Num or Not
Hint: A Neon Number is a number where the sum of the digits of its square is
      equal to the original number
Ex:
Consider 9
Square of 9 = 9 × 9 = 81
Sum of digits = 8 + 1 = 9
Result: Since 9 = 9, it is a Neon Number ✅

*/

import java.util.Scanner;
class P9_NeonNumCheck{
	public static void main(String[] args) {
		
		System.out.print("\n Enter the Num : ");
		int num = new Scanner(System.in).nextInt();

		int sqrt = num * num; // find the sqr of the num
		int sum = 0;

		for (int i = sqrt; i > 0; i /= 10) { // to fetch the each digit and remove
			int rem = i % 10; // to fetch the digit from last one by one
			sum += rem;  // add that digit one by one in sum get the total.
		}

		System.out.println  // Check the sum == original Num
		(sum == num ? num + " is a Neuon Num!" : num + " is not Neuon Num!");
	}
}
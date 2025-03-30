/* 
Reverse the num using Recursion Method
I/P = 12345
O/P = 54321
*/

import java.util.Scanner;
class P04_ReverseNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println("Reverse Num is : " + reverse(num, 0));
	}

	// METHODS
	public static int reverse(int num, int rev){
		if (num != 0) {  // check num everytime is != 0 ?
			int last = num % 10;  // fetch the last num
			rev = (rev * 10) + last;  // add last in the rev order
			return reverse(num/10, rev); // again call itselft by updating num means remove last digit and give the updated rev.
		}
		return rev; // if condition false return the rev

		// return (num != 0)?(reverse(num/10, (rev * 10) + num % 10)):(rev); // OR Using Optimized Method
	}
}
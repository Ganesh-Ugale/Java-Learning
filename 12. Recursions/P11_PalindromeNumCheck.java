/* 
Check the num is Palindrome num, Reverse the num using Recursion Method
I/P = 121
O/P = 121 is a Palindrome Num
*/

import java.util.Scanner;
class P11_PalindromeNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println("Num is Palimdrome? : " + isPalindrome(num, num, 0));
	}

	// METHODS
	public static boolean isPalindrome(int num,int dup, int rev){
		if (num == 0) // Checks each time num == 0
			return rev == dup; // if true then return true rev == dup Otherwise Flase;
		else{
			rev = (rev * 10) + (num % 10) // Fetch the last Digit and add in rev order
			return isPalindrome(num/10, dup, rev);
		}

		// return (num == 0)?(rev == dup):(reverse(num/10, dup, (rev * 10) + (num % 10))); // OR Using Optimized Method
	}
}
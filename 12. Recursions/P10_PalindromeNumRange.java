/* 
Print the range of Palindrome Num in between user Entered Range
Check the num is Palindrome num, Reverse the num using Recursion Method
Ex:
I/P = start = 1
      End = 100
O/P = Print all Palindrome num in between 1 to 100
*/

import java.util.Scanner;
class P10_PalindromeNumRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start num : ");
		int start = sc.nextInt();
		System.out.print("\nEnter the end num : ");
		int end = sc.nextInt();

		// Loop to print the palindrome num in range
		for (int i = start; i <= end; i++)
			if (isPalindrome(i,i,0))
				System.out.println(i);
	}

	// METHODS
	public static boolean isPalindrome(int num,int dup, int rev){
		if (num == 0) // Checks each time num == 0
			return rev == dup; // if true then return true rev == dup Otherwise Flase;
		else
			return isPalindrome(num/10, dup, (rev * 10) + (num % 10));

		// return (num == 0)?(rev == dup):(reverse(num/10, dup, (rev * 10) + (num % 10))); // OR Using Optimized Method
	}
}
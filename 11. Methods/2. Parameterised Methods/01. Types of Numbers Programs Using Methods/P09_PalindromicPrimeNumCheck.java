/*
Check the num is palindromic prime num or not
Ex:
num = 101
rev = 101 same as original num
check the 101 is a Prime or not
if yes then it is a Palindromic num!
*/

import java.util.Scanner;
class P09_PalindromicPrimeNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println
		(num == reverse(num) && isPrime(num) ? num + " is a Palindromic Prime Num!" : num + " is not a Palindromic Prime Num!");;
	}

	// METHODS

	// find reverse num
	public static int reverse(int num){
		int rev = 0;
		for (int i = num; i > 0; i /= 10) {
			rev = (rev * 10) + i % 10;
		}
		return rev;
	}

	// check the num is Prime 
	public static boolean isPrime(int num){
		int den = 2;
		while (den < num) {
			if (num % den == 0)
				return false;
			den++;
		}
		return true;
	}
}
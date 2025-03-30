/* 
Check the num is Prime Or Not using Recursion Method
Ex:
I/P = 5
O/P = true // OR 5
*/

import java.util.Scanner;
class P06_PrimeNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(isPrime(num, 2));
	}
	// METHODS
	public static boolean isPrime(int num, int den){
		if(den == num) // checks den == num are equal then return true
			return true;
		else if((den < num )&& (num % den == 0)) // check the den < num & also check the num % den == 0 then return false
			return false;
		return isPrime(num, ++den); // if above both condition not satifying then return call isPrime(num, ++den) i.e num as it is and increase den by 1.

		
		// return (den == num)?(true):((den < num) && (num % den == 0)?(false):(isPrime(num, ++den))); // OR Use Optimized Method
	}
}
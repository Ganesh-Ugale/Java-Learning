/* 
Print the Range of Prime Num using recursion Method
Check the num is Prime Or Not using Recursion Method
Ex:
I/P = Start = 1
	  End  = 10
O/P = prints the prime num in between 1 to 10
*/

import java.util.Scanner;
class P05_PrimeNumRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start num : ");
		int start = sc.nextInt();
		System.out.print("\nEnter the end num : ");
		int end = sc.nextInt();

		// Loop to Print the Prime nums Range
		for (  ; start <= end; start++)
			if (isPrime(start, 2))
				System.out.print(start + " ");
			
	}
	// METHODS
	public static boolean isPrime(int num, int den){
		if(den == num) // checks den == num are equal then return true
			return true;
		else if((den < num )&& (num % den == 0)) // check the den < num & also check the num % den == 0 then return false
			return false;
		else if(num==1)
			return false;
		return isPrime(num, ++den); // if above both condition not satifying then return call isPrime(num, ++den) i.e num as it is and increase den by 1.

		
		// return (den == num)?(true):((den < num) && (num % den == 0)?(false):(isPrime(num, ++den))); // OR Use Optimized Method
	}
}
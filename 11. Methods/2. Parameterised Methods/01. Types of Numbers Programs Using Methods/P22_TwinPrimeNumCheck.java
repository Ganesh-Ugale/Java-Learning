/*
A Twin Prime Number is a prime number that has a difference of 2 with another prime number.

Example:
(3, 5) → Both are prime and 5 - 3 = 2
(11, 13) → Both are prime and 13 - 11 = 2
(17, 19) → Both are prime and 19 - 17 = 2
These pairs are called Twin Primes because they are "close" together in value.
*/

import java.util.Scanner;
class P22_TwinPrimeNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter the Num2 : ");
		int num2 = sc.nextInt();

		System.out.println(num1+":"+num2 + " is Twin Prime Num? : " + isTwinPrime(num1,num2));
	}
	// METHODS
	// Check Num is Prime
	public static boolean isPrime(int num){
		int den = 2;
		while (den < num) {
			if (num%den == 0)
				return false;
			den++;
		}
		return den == num;
	}

	// Check num is CoPrime
	public static boolean isTwinPrime(int num1, int num2){
		// To Find the Max and Min bcz always get differance from max - min 
		int max = (num1>num2)?(num1):(num2);  // Find the Max Num
		int min = (num1<num2)?(num1):(num2);  // Find the Min Num

		if (isPrime(num1) && isPrime(num2))  // Verify Both Num is Prime
			return max - min <= 2;  // if yes then find differance & check differance <= 2 or Not!!! then it return true & false
		return false;  // if anyone num is not prime return false;
	}
}


// Program to Print The Range of Twin Prime from 1 to 100

// class P22_TwinPrimeNumCheck{
// 	public static void main(String[] args) {

// 		// To Print the All Twin Prime Nums from 1 to 100
// 		for (int i = 1; i <= 100; i++)
// 			for (int j = 1; j <= 100; j++)
// 				if (isTwinPrime(i,j))
// 					System.out.print(i+":"+j + " ");
// 	}
// 	// METHODS
// 	// Check Num is Prime
// 	public static boolean isPrime(int num){
// 		int den = 2;
// 		while (den < num) {
// 			if (num%den == 0)
// 				return false;
// 			den++;
// 		}
// 		return den == num;
// 	}

// 	// Check num is Twin Prime
// 	public static boolean isTwinPrime(int num1, int num2){
// 		// To Find the Max and Min bcz always get differance from max - min 
// 		int max = (num1>num2)?(num1):(num2);  // Find the Max Num
// 		int min = (num1<num2)?(num1):(num2);  // Find the Min Num

// 		if (isPrime(num1) && isPrime(num2))  // Verify Both Num is Prime
// 			return max - min <= 2;  // if yes then find differance & check differance <= 2 or Not!!! then it return true & false
// 		return false;  // if anyone num is not prime return false;
// 	}
// }
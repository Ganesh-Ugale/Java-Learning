/*
A Smith Number is a composite number whose sum of digits is equal to the sum of the digits of its prime factorization (excluding 1).

Example:
4937775

Sum of digits: 4 + 9 + 3 + 7 + 7 + 7 + 5 = 42
Prime factorization: 3 × 5 × 5 × 65837
Sum of digits of factors: (3) + (5+5) + (6+5+8+3+7) = 42 ✅
Since both sums are equal, 4937775 is a Smith Number.
*/

import java.util.Scanner;
class P26_SmithNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(num + " is Smith Num? : " + isSmith(num));
		
	}
	// METHODS

	// Sum of Digits of Num
	public static int sumOfDigits(int num){
		int sum = 0;
		for (int i = num; i > 0; i /= 10) {
			int last = i % 10;
			sum += last;
		}
		return sum;
	}

	// To Check the Num is Prime
	public static boolean isPrime(int num){
		int div = 2;
		while (div < num) {
			if (num % div == 0) {
				return false;
			}
			div++;
		}
		return div == num;
	}

	// To Find the Prime Factors Sum of Num
	public static int primeFactorsSum(int num){
		int sum = 0;
		for (int i = 2; i <= num; i++) {  // 
			if (num % i == 0 && isPrime(i)) { // find the prime factors only
				sum += sumOfDigits(i); // if prime factor found so get the sum of it's digits and add in sum
				num /= i; // update num by it's num / factor
				i = 1;  // if factor found so only re-initilize the i to check the updated num from 2 again, updates i = 1 and again i++ i.e i = 2
			}
		}
		return sum;
	}

	// Check the num is Smith or not
	public static boolean isSmith(int num){
		if (isPrime(num)) {  // if num is prime so it is not smit so return false
			return false;
		}
		return sumOfDigits(num) == primeFactorsSum(num); // check both are equals
	}
}



// Print the Range of Smith Num From 1 to 1000

// class P26_SmithNumCheck{
// 	public static void main(String[] args) {
		
// 		// To Print the Smith Num Range from 1 to 1000
// 		for (int i = 1; i <= 1000; i++) {
// 			if (isSmith(i)) {
// 				System.out.print(i + " ");
// 			}
// 		}
// 		System.out.println();
// 	}
// 	// METHODS

// 	// Sum of Digits of Num
// 	public static int sumOfDigits(int num){
// 		int sum = 0;
// 		for (int i = num; i > 0; i /= 10) {
// 			int last = i % 10;
// 			sum += last;
// 		}
// 		return sum;
// 	}

// 	// To Check the Num is Prime
// 	public static boolean isPrime(int num){
// 		int div = 2;
// 		while (div < num) {
// 			if (num % div == 0) {
// 				return false;
// 			}
// 			div++;
// 		}
// 		return div == num;
// 	}

// 	// To Find the Prime Factors Sum of Num
// 	public static int primeFactorsSum(int num){
// 		int sum = 0;
// 		for (int i = 2; i <= num; i++) {  // 
// 			if (num % i == 0 && isPrime(i)) { // find the prime factors only
// 				sum += sumOfDigits(i); // if prime factor found so get the sum of it's digits and add in sum
// 				num /= i; // update num by it's num / factor
// 				i = 1;  // if factor found so only re-initilize the i to check the updated num from 2 again, updates i = 1 and again i++ i.e i = 2
// 			}
// 		}
// 		return sum;
// 	}

// 	// Check the num is Smith or not
// 	public static boolean isSmith(int num){
// 		if (isPrime(num)) {  // if num is prime so it is not smit so return false
// 			return false;
// 		}
// 		return sumOfDigits(num) == primeFactorsSum(num); // check both are equals
// 	}
// }
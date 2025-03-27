/*
A Pronic Number (also called a Rectangular Number or Product of Two Consecutive Integers) is a number that is the product of two consecutive integers.

Formula: 𝑛×(𝑛+1)
Examples:
✅ Pronic Numbers:
0 → 0 × 1 = 0
2 → 1 × 2 = 2  
6 → 2 × 3 = 6
20 → 4 × 5 = 20
*/

import java.util.Scanner;
class P19_PronicNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(isPronic(num));
	}
	// METHODS
	public static boolean isPronic(int num){
		int n = 1;
		while (true) {  // stay always true
			if (n*(n+1) == num)  // if num is divisible by 2 consiquetive num
				return true;
			else if (n*(n+1) > num)  // if n*(n+1) > num so return false
				return false;
			n++; // always n++; 
		}
	}
}


// Print the Range of Pronic Num from 1 to 1000

// class P19_PronicNumCheck{
// 	public static void main(String[] args) {

// 		// Print the range of Pronic Num from 1 to 1000
// 		for ( int i = 1; i <= 1000; i++)
// 			if (isPronic(i))
// 				System.out.print(i + " ");

// 	}
// 	// METHODS
// 	public static boolean isPronic(int num){
// 		int n = 1;
// 		while (true) {  // stay always true
// 			if (n*(n+1) == num)  // if num is divisible by 2 consiquetive num
// 				return true;
// 			else if (n*(n+1) > num)  // if n*(n+1) > num so return false
// 				return false;
// 			n++; // always n++; 
// 		}
// 	}
// }
/*
First Few Tetrahedral Numbers:
✅ 1, 4, 10, 20, 35, 56, 84, 120, 165, …

formula = Tn = n*(n+1)*(n+2)/6

Ex : 
Enter N: 6
First 6 Tetrahedral Numbers: 1, 4, 10, 20, 35, 56

*/

import java.util.Scanner;
class P31_TetrahedralNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter N : ");
		int n = sc.nextInt();

		// Use Anyone of the following

		// to print First n tetrahedral num
		// tetrahedral(n);

		// To Check n is Tetrahedral Or Not!
		System.out.print(n + " is a Tetrahedral num? : " + isTetrahedral(n));

		System.out.println();
	}

	// Methods

	// if you want to print the First n Tetrahedral Num so use this method
	// public static void tetrahedral(int n){
	// 	System.out.print("\nFirst " + n + " tetrahedral numbers : ");
	// 	for (int i = 1; i <= n; i++) {
	// 		System.out.print(i*(i+1)*(i+2)/6 + " ");
	// 	}
	// 	System.out.println();
	// }

	// if you want check the user entered num is tetrahedral or not use this method
	public static boolean isTetrahedral(int n){
		for (int i = 1; i <= n; i++) {
			if (i*(i+1)*(i+2)/6 == n) {
				return true;
			}
		}
		return false;
	}
}
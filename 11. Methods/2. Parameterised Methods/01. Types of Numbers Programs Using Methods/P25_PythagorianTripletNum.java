/*
Pythagorean Triplet consists of three positive integers (a, b, c) that satisfy the Pythagorean theorem: a^2 + b^2 = c^2

Example:
(3,4,5) ==> 3^2 + 4^2 = 9 + 16 = 25 = 5^2
(5,12,13) ==> 5^2 + 12^2 = 25 + 144 = 169 = 13^2

These numbers form the sides of a right-angled triangle, where c is the hypotenuse.
*/

import java.util.Scanner;
class P25_PythagorianTripletNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the 1st Side : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter the 2nd Side : ");
		int num2 = sc.nextInt();
		System.out.print("\nEnter the 3rd Side : ");
		int num3 = sc.nextInt();
		System.out.println(num1+"^2 + "+num2+"^2 = "+num3+"^2 is a Pythagorian Triplet? : " + isPythagorianTriplet(num1,num2,num3));
	}
	// METHODS
	// Check for Pythagorian Triplet
	public static boolean isPythagorianTriplet(int num1, int num2, int num3){
		return square(num1) + square(num2) == square(num3);
	}

	// To Find the Square of Num
	public static int square(int num){
		int pow = 1;
		for (int i = 1; i <= 2; i++)
		 	pow *= num;
		return pow;
	}
}



// To Find the How Many Pythagorian Triplet Nums From 1 to 100

// class P25_PythagorianTripletNum{
// 	public static void main(String[] args) {
// 		for (int i = 1; i <= 100; i++) {
// 			for (int j = 1; j <= 100; j++) {
// 				for (int k = 1; k <= 100; k++) {
// 					if (isPythagorianTriplet(i,j,k)) {
// 						System.out.println(i + "^2 + " + j + "^2 = " + k + "^2 ");
// 					}
// 				}
// 			}
// 		}
// 	}
// 	// METHODS
// 	// Check for Pythagorian Triplet
// 	public static boolean isPythagorianTriplet(int num1, int num2, int num3){
// 		return square(num1) + square(num2) == square(num3);
// 	}

// 	// To Find the Square of Num
// 	public static int square(int num){
// 		int pow = 1;
// 		for (int i = 1; i <= 2; i++)
// 		 	pow *= num;
// 		return pow;
// 	}
// }
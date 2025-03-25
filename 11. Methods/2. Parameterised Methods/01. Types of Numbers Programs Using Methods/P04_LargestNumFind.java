/*
Write a Program to Check the Largest Num Among 3 Num's Using return type Methods!
*/

import java.util.Scanner;
class P04_LargestNumFind{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter Num2 : ");
		int num2 = sc.nextInt();
		System.out.print("\nEnter Num3 : ");
		int num3 = sc.nextInt();
		System.out.println();
		System.out.println(largest(num1, num3, num2) + " is the Largest Num!"); // here we can write an arguments in any order that's Not Matter bcz here num3 is copy in method formal args in num2.
	}

	// METHODS
	public static int largest(int num1, int num2, int num3){ 
		return (num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3));
	}
}
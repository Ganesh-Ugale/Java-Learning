/*
A Lazy Number is a number that belongs to the sequence of Lazy Caterer's numbers, which represent the maximum number of pieces a circle can be divided into using a given number of straight-line cuts.

The sequence follows the formula:
L(n)= (n(n+1)/2) + 1

1, 2, 4, 7, 11, 16, 22, 29, 37, 46
*/

import java.util.Scanner;
class P24_LazyNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nHow Many Number you want : ");
		int num = sc.nextInt();
		LazyNums(num); 			
	}
	// METHODS
	public static void LazyNums(int n){
		for (int i = 0; i <= n; i++) 
			System.out.print((i*(i+1)/2) + 1 + " ");
		System.out.println();
	}
}
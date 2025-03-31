/*
The Program for Print the Fibonacci Series using the Recursion Method Call
Ex:
I/P = 10 
O/P = print the series upto 10th iteration of fibo series
*/

import java.util.Scanner;
class P15_FibonacciSeries{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nFibo Series Generate Upto iteration (n): ");	
		int n = sc.nextInt();
		fibo(n, 0, 1);
	}
	// METHODS
	public static void fibo(int n, int num1, int num2){
		if (n > 0) { // When n becomes 0 then program exits that means goes to return
			int num3 = num1 + num2; // here add num1 + num2 in num3
			System.out.print(num1 + " ");  // each time the num2 comes in num2 so print num1 directly
			fibo(--n, num2, num3); // here n decreses and put the num2 in the position of num1 and num3 in the position of num3.
		}
		return; // when if condition satisfy then program get return
	}
}
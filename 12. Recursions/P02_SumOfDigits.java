/*
Find the Sum of Digits of Num using Recursion Method
Ex:
I/P = 1234
Output = Sum is : 10
*/

import java.util.Scanner;
class P02_SumOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the num : ");
		int num = sc.nextInt();
		System.out.println("Sum is : " + sumOfDigits(0, num));
	}
	// METHODS
	public static int sumOfDigits(int sum, int num){
		if (num == 0) {
			return sum;
		}
		else{
			int last = num % 10;
			sum += last;
			return sumOfDigits(num /= 10, sum);
		
			// return sumOfDigits(sum += num % 10, num /= 10); // istead of write above 3 lines we can aslo write below one line
		}
		// return (num == 0)?(sum):(sumOfDigits(sum += num % 10, num /= 10)); // Using Optimized Method
	}
}

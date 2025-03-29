/*
Range of Sum of digits in between range
Find the Sum of Digits of Num using Recursion Method
Ex:
I/P = Start = 1
	  End = 100
Output = Sum is : sum of all individual num digits 1 to 100 num digits
i.e 11 = 1 + 1 = 2, 45 = 4 + 5 = 9 etc
*/

import java.util.Scanner;
class P01_SumOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start num : ");
		int start = sc.nextInt();
		System.out.print("\nEnter the end num : ");
		int end = sc.nextInt();

		// Loop to print the sum of digits of each individual num from user entered range
		for (  ; start <= end; start++) {
			System.out.print(sumOfDigits(0, start) + " ");
		}

	}
	// METHODS
	public static int sumOfDigits(int sum, int num){
		if (num == 0) {
			return sum;
		}
		else{
			int last = num % 10;
			sum += last;
			return sumOfDigits(sum, num /= 10);
		
			// return sumOfDigits(sum += num % 10, num /= 10); // istead of write above 3 lines we can aslo write below one line
		}
		// return (num == 0)?(sum):(sumOfDigits(sum += num % 10, num /= 10)); // Using Optimized Method
	}
}

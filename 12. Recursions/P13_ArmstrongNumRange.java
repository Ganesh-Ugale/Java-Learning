/*
Check the Armstrong num in user entered range using recusion Method

An Armstrong Number (also called a Narcissistic Number) is a number where the sum of its digits each raised to the power of the total number of digits equals the number itself.
Example:
153 → 1^3+5^3+3^3=1+125+27=153 ✅
If a number satisfies this condition, it is an Armstrong Number. 🚀
*/

import java.util.Scanner;
class P13_ArmstrongNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start num : ");
		int start = sc.nextInt();
		System.out.print("\nEnter the end num : ");
		int end = sc.nextInt();

		// Loop to find the Armstrong num in user entered range
		for (  ; start <= end; start++)
			if (sumOfDigits(0, start, start))
				System.out.print(start + " ");

	}
	// METHODS
	public static int count(int num, int count){
		return (num > 0)?(count(num /= 10, ++count)):(count); // using Optimized Method
	}
	public static int pow(int base, int pow){
		return (pow == 0)?(1):(base * pow(base, pow - 1)); // using Optimized Method
	}
	public static boolean sumOfDigits(int sum, int temp, int num){
		return (temp == 0)?(num==sum):(sumOfDigits(sum += pow(temp % 10, count(num, 0)), temp /= 10, num)); // Using Optimized Method
	}
}
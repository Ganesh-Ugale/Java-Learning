/*
Example:
145
Digits: 1, 4, 5
1!+4!+5!=1+24+120=145 ✅ Strong Number

List of Strong Numbers from 1 to 1000:
1, 2, 145
*/

import java.util.Scanner;
class P13_StrongNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println
		(isStrong(num) ? num + " is Strong Num!" : num + " is not Strong Num!");
	}

	// METHODS
	// Check the num is Strong or not
	public static boolean isStrong(int num){
		int sum = 0;
		for (int i = num; i > 0; i /= 10) {
			sum += fact(i % 10); // sum of fact digits
		}
		return sum == num; // returns is true or false
	}

	// To Take the Factorial of Num
	public static int fact(int digit){
		int fact = 1; 
		for (int i = 1; i <= digit; i++) {
			fact *= i; // factorial take
		}
		return fact; // returns Factorial
	}
}
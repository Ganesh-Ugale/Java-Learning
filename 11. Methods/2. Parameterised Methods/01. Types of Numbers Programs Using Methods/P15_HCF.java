/*
HCF (Highest Common Factor), also known as GCD (Greatest Common Divisor), is the largest number that divides two or more numbers exactly without leaving a remainder.

Example:
Find HCF of 12 and 18
Factors of 12: 1, 2, 3, 4, 6, 12
Factors of 18: 1, 2, 3, 6, 9, 18
👉 The highest common factor is 6. So, HCF(12,18) = 6 ✅

HCF is useful in simplifying fractions, number theory, and problem-solving. 🚀
*/

import java.util.Scanner;
class P15_HCF{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter Num2 : ");
		int num2 = sc.nextInt();
		System.out.println(Hcf(num1,num2));
	}
	// METHODS
	public static int Hcf(int num1, int num2){
		int small = (num1 < num2)?(num1):(num2);
		while (true){
			if (num1 % small == 0 && num2 % small == 0)
				return small;
			small--;
		}
	}
}
/*
Co-Prime Numbers (also called Relatively Prime Numbers) are two numbers that have no common factors other than 1.

Example:
(5, 9) → Factors of 5: {1, 5}, Factors of 9: {1, 3, 9} → No common factor except 1 ✅ Co-Prime
(8, 12) → Factors of 8: {1, 2, 4, 8}, Factors of 12: {1, 2, 3, 4, 6, 12} → Common factor = 1, 2, 4 ❌ Not Co-Prime
*/

import java.util.Scanner;
class P16_CoPrimeCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Num1 : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter Num2 : ");
		int num2 = sc.nextInt();
		System.out.println(isCoPrime(num1, num2));
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
	public static boolean isCoPrime(int num1, int num2){
		return Hcf(num1, num2) == 1;
	}
}
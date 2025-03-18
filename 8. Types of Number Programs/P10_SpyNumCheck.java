/*
A Spy Number is a number where the sum of its digits is equal to the product of its digits.

Example:
112
Sum: 1 + 1 + 2 = 4
Product: 1 × 1 × 2 = 2    	
❌ Not a Spy Number

123
Sum: 1 + 2 + 3 = 6
Product: 1 × 2 × 3 = 6
✅ Spy Number

456
Sum: 4 + 5 + 6 = 15
Product: 4 × 5 × 6 = 120
❌ Not a Spy Number
*/

import java.util.Scanner;
class P10_SpyNumCheck{
	public static void main(String[] args) {
		
		System.out.print("\nEnter the Num : ");
		int num = new Scanner(System.in).nextInt(); 
		int sum = 0, prod = 1; 

		// Extract the each digit
		for (int i = num; i > 0; i /= 10) {
			int rem = i % 10; // to fetch the last digit
			sum += rem; // take the sum with prev digit
			prod *= rem; // take the product with prev digit
		}
		System.out.println // check sum == prod or not
		(sum == prod ? num + " is a Spy Num!" : num + " is Not a Spy Num!");
	}
}
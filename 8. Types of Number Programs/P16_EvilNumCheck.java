/*
An Evil Number is a number that has an even number of 1s in its binary representation.

Example:
9 → Binary: 1001 → (Two 1s) ✅ Evil Number
23 → Binary: 10111 → (Four 1s) ✅ Evil Number
7 → Binary: 111 → (Three 1s) ❌ Not an Evil Number
If the count of 1s in the binary form is even, it's an Evil Number! 🚀
*/

import java.util.Scanner;
class P16_EvilNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Dicimal Num : ");
		int decimal = sc.nextInt();
		String rev = ""; // to store rev the bin num
		int cnt = 0; // Initially cnt should be 0

		for (int i = decimal; i > 0; i /= 2) {  // each time num divides 2 i.e updation
			int bin = i % 2; // take the reminder with divides 2 i.e bin
			if (bin==1)  // if true
				cnt++;  // 1's cnt is increases
			rev = bin + rev; // stores each bin num in rev order
		}
		System.out.println("Count : " + cnt);
		System.out.println  // if cnt is divisible by 2
		(cnt % 2 == 0 ? decimal + " is a Evil Num!" : decimal + " is not Evil Num!");
	}
}
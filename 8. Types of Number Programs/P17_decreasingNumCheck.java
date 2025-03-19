/*
A Decreasing Number is a number whose digits are arranged in strictly decreasing order from left to right (each digit is smaller than or equal to the previous one).

Examples:
✅ 543 → (5 > 4 > 3) Decreasing
✅ 9762 → (9 > 7 > 6 > 2) Decreasing
✅ 87721 → (8 > 7 ≥ 7 > 2 > 1) Decreasing

Non-Decreasing Examples:
❌ 123 → (Increasing)
❌ 8523 → (8 > 5 but 5 < 2, so not decreasing)

If digits always move in descending order, it's a Decreasing Number! 🚀
*/

import java.util.Scanner;
class P17_DecreasingNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int max = 0, cnt1 = 0, cnt2 = 0;

		for (int j = num; j > 0; j /= 10) {// updates num each time to remove last digit each time
			cnt1++; // digit cnt1++
			int rem = j % 10; // fetch the last digit
			if (max <= rem){ // if the max <= last digit
				max = rem; // assign the digit each time to max
				cnt2++; // if the digits are in sequencial order then it is cnt2++
			}
		}
		System.out.println
		(cnt1 == cnt2 ? num + " is a decreasing Num!" : num + " is not decreasing Num!");
	}
}
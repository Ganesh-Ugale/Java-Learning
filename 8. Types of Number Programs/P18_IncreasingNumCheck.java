/*
An Increasing Number is a number whose digits are arranged in strictly increasing order from left to right (each digit is greater than or equal to the previous one).

Examples:
✅ 123 → (1 < 2 < 3) Increasing
✅ 5789 → (5 < 7 < 8 < 9) Increasing
✅ 23389 → (2 < 3 ≤ 3 < 8 < 9) Increasing

Non-Increasing Examples:
❌ 321 → (Decreasing)
❌ 1352 → (1 < 3 < 5 but 5 > 2, so not increasing)

If digits always move in ascending order, it's an Increasing Number! 🚀
*/

import java.util.Scanner;
class P18_IncreasingNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int min = 9, cnt1 = 0, cnt2 = 0;

		for (int j = num; j > 0; j /= 10) {// updates num each time to remove last digit each time
			cnt1++; // digit cnt1++
			int rem = j % 10; // fetch the last digit
			if (min >= rem){ // if the min >= last digit
				min = rem; // assign the digit each time to min
				cnt2++; // if the digits are in sequencial order then it is cnt2++
			}
		}
		System.out.println
		(cnt1 == cnt2 ? num + " is a Increasing Num!" : num + " is not Increasing Num!");
	}
}
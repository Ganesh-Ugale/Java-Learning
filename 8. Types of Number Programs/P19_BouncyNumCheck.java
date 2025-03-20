/*
A Bouncy Number is a number whose digits are neither in strictly increasing nor strictly decreasing order. It means the digits both increase and decrease at different positions in the number.

Examples of Bouncy Numbers:
✅ 132 → (1 → 3 ↑, 3 → 2 ↓) Bouncy
✅ 25341 → (2 → 5 ↑, 5 → 3 ↓, 3 → 4 ↑, 4 → 1 ↓) Bouncy

Non-Bouncy Numbers:
❌ 12345 → (Strictly increasing)
❌ 9876 → (Strictly decreasing)

If the digits do not follow a consistent increasing or decreasing pattern, it's a Bouncy Number! 🚀
*/

import java.util.Scanner;
class P19_IncreasingNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int min = 9, cnt1 = 0, cnt2 = 0, max = 0, cnt3 = 0;

		for (int j = num; j > 0; j /= 10) {// updates num each time to remove last digit each time
			cnt1++; // digit cnt1++
			int rem1 = j % 10; // fetch the last digit
			if (min >= rem){ // if the min >= last digit
				min = rem; // assign the digit each time to min
				cnt2++; // if the digits are in sequencial order then it is cnt2++
			}	
				if (max <= rem) { // if the max <= last digit
					max = rem; // assign the digit each time to max
					cnt3++; // if the digits are in sequencial order then it is cnt3++
				}
		}
		System.out.println // if anyone condition is true then it is not a bouncy num but both conditions are false then it is a bouncy num
		((cnt1 == cnt2) || (cnt1 == cnt3) ? num +  " is not a Bouncy Num!" : (num + " is a Bouncy Num"));
	}
}
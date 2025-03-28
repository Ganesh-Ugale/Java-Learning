/*
A Bouncy Number is a positive integer where its digits are neither entirely increasing nor entirely decreasing from left to right.

Concept:
A number is increasing if its digits are in non-decreasing order (e.g., 134578).
A number is decreasing if its digits are in non-increasing order (e.g., 987620).
If a number has both increasing and decreasing characteristics, it is bouncy (e.g., 132, 85741, 155349).
Examples:
Not Bouncy: 12345 (increasing), 9876 (decreasing)
Bouncy: 132, 253, 914, 19876

*/

import java.util.Scanner;
class P27_BouncyNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(num + " is Bouncy? : " + isBouncy(num));
	}
	// METHODS
	// To Check the num is in Increasing Order
	public static boolean isIncreasing(int num) {
		int min = 9, len = 0, cnt = 0;
		for (int i = num; i > 0; i /= 10) {// updates num each time to remove last digit each time
			len++; // digit len++
			int rem = i % 10; // fetch the last digit
			if (min >= rem){ // if the min >= last digit
				min = rem; // assign the digit each time to min
				cnt++; // if the digits are in sequencial order then it is cnt++
			}
		}
		return len == cnt;
	}

	// To Check the num is in Decreasing Order
	public static boolean isDecreasing(int num){
		int max = 0, len = 0, cnt = 0;  // initially all cnt = 0
		for (int i = num; i > 0; i /= 10) {
			len++; // all digits comes inside loop and len++ every time
			int last = i % 10; // fetch the last digit
			if (max <= last) {  // if max is <= last then
				max = last;  // if num is decreasing order so each time max updates and
				cnt++; // cnt2++ 
			}
		}
		return len == cnt; // in last len of num is == cnt
	}

	// Check the Num is Bouncy
	public static boolean isBouncy(int num){
		if (isIncreasing(num) || isDecreasing(num)) {
			return false;
		}
		return true;
	}
}
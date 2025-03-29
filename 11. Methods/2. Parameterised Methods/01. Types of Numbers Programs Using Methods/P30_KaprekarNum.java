/*
Steps:

1️⃣ Square the Number
2️⃣ Split the Square
3️⃣ Sum the Parts 
4️⃣ Check the Condition → If the sum equals the original number 𝑁, then it is a Kaprekar Number!

Example 1: Checking 45
✅ Step 1: Square the number → 45^2 = 2025
✅ Step 2: Split it into two parts → 20 and 25
✅ Step 3: Add the parts → 20 + 25 = 45
🎯 Since the sum equals the original number, 45 is a Kaprekar Number!
*/

import java.util.Scanner;
class P30_KaprekarNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println("\n" + num + " is an Kaprekar Num? : " + isKaprekar(num));
	}

	// METHODS

	// to find the cnt
	public static int cnt(int num){
		int cnt = 0;
		for (int i = num; i > 0; i /= 10) {
			cnt++;
		}
		return cnt;
	}

	// divide num into 2 equal parts.
	public static int divideEqualParts(int num){
		int multi = 1;  // initially multiplier = 1
		if (cnt(num)%2 != 0) {  // this checks if the cnt is odd then multipler assign 10 initially, bcz odd len num has not divides into two eqal parts.
			multi = 10;
		}
		for (int i = 1; i <= cnt(num)/2; i++) {
			multi *= 10;  // multiply each time into 10
		}
		return multi;
	}

	// check the num is kaprekar num?
	public static boolean isKaprekar(int num){
		int sqr = num * num; // take a sqr of num
		int sum = sqr % divideEqualParts(sqr) + sqr / divideEqualParts(sqr); // adding it's both equal parts into sum
		return sum == num;  // checks sum == origianl num?
	}
}



// To Find the range of Kparekar Num.

// class P30_KaprekarNum{
// 	public static void main(String[] args) {

// 		// Checking the range from 1 to 1000
// 		for (int i = 1; i <= 1000; i++) {
// 			if (isKaprekar(i)) {
// 				System.out.print(i + " ");
// 			}
// 		}
// 	}	

// 	// METHODS

// 	// to find the cnt
// 	public static int cnt(int num){
// 		int cnt = 0;
// 		for (int i = num; i > 0; i /= 10) {
// 			cnt++;
// 		}
// 		return cnt;
// 	}

// 	// divide num into 2 equal parts.
// 	public static int divideEqualParts(int num){
// 		int multi = 1;
// 		if (cnt(num)%2 != 0) {
// 			multi = 10;
// 		}
// 		for (int i = 1; i <= cnt(num)/2; i++) {
// 			multi *= 10;
// 		}
// 		return multi;
// 	}

// 	// check the num is kaprekar num?
// 	public static boolean isKaprekar(int num){
// 		int sqr = num * num;
// 		int sum = sqr % divideEqualParts(sqr) + sqr / divideEqualParts(sqr);
// 		return sum == num;
// 	}
// }
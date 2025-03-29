/*
A Strontio Number is a four-digit number that, when multiplied by 2, always has 69 in the middle two digits of the result.

For example, if N = 1347, then:
1347 x 2 = 2694 → Middle two digits 69 ✅
2846 × 2 = 5692 → Middle two digits 69 ✅
etc...

NOTE: A Strontio Number is always a four-digit number Only
	  Strontio Numbers cannot be greater than four digits.

*/

import java.util.Scanner;
class P29_StrontioNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println("\n" + num + " is a Strontio Num? : " + isStrontio(num));
	}

	// METHODS
	public static boolean isStrontio(int n){
		int num = n * 2;  // mul num * 2 
		if (num > 1000 && num < 10000) {  // check the num is 4 digit or not
			num %= 1000;  // to fetch the last 3 digit
			num /= 10;  // then remove the 1 last digit then we get remaining num is a middle 2 digit of original num.
		}	
		return num == 69; // then check the num == 69
	}
}



// Print the all Strontio Num from 1000 to 9999


// class P29_StrontioNumCheck{
// 	public static void main(String[] args) {
// 		for (int i = 1000; i <= 4999 ; i++) {  // why in between 1000 and 9999 bcz stronio num is always in between this 4 digit range only
// 			if (isStrontio(i)) {
// 				System.out.print(i + " ");
// 			}
// 		}
// 	}

// 	// METHODS

// 	public static boolean isStrontio(int n){
// 		int num = n * 2;  // mul num * 2 
// 		if (num > 1000 && num < 10000) {  // check the num is 4 digit or not
// 			num %= 1000;  // to fetch the last 3 digit
// 			num /= 10;  // then remove the 1 last digit then we get remaining num is a middle 2 digit of original num.
// 		}	
// 		return num == 69; // then check the num == 69
// 	}
// }
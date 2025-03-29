/*
A Mystery Number is a number that can be expressed as the sum of a number and its reverse.

Example:
Let's check 121:

X = 29, Reverse of 29 is 92

29 + 92 = 121

So, 121 is a Mystery Number

Key Fact:
A Mystery Number is always greater than 10 (because single-digit numbers cannot have a valid X)
*/

// import java.util.Scanner;
// class P28_MysteryNumCheck{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("\nEnter the Num : ");
// 		int num = sc.nextInt();
// 		System.out.println(isMystry(num));
// 	}
// 	// METHODS

// 	// reverse of Num
// 	public static int reverse(int num){
// 		int rev = 0;
// 		for (int i = num; i > 0; i /= 10) {
// 			int last = i % 10;
// 			rev = (rev * 10) + last;
// 		}
// 		return rev;
// 	}
   
   // To Check the num is Mystry
// 	public static String isMystry(int num){
// 		if (num < 10) {
// 			return (num + " is less than 10!");
// 		}
// 		for (int i = 0; i <= num/2 ; i++) {
// 			if (i + reverse(i) == num) {
// 				return ("\n" + num + " is a Mystry Num! : " + i + " + " + reverse(i) + " = " + num);

// 			}
// 		}
// 		return ("Not a Mystry Num!");
// 	}
// }


// Print the Range of Mystry Num:


class P28_MysteryNumCheck{
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (isMystry(i)) {
				System.out.print(i + " ");
			}
		}
	}
	// METHODS

	// reverse of Num
	public static int reverse(int num){
		int rev = 0;
		for (int i = num; i > 0; i /= 10) {
			int last = i % 10;
			rev = (rev * 10) + last;
		}
		return rev;
	}

	// Check the Num is Mystry Num
	public static boolean isMystry(int num){
		if (num < 10) { // if num is less than 10 so return false
			return false;
		}
		for (int i = 0; i <= num/2 ; i++) { // stops loop at num/2 bcz any num sum is less than the it's Half
			if (i + reverse(i) == num) {  // check if i + reverse(i) == num
				return true;  // return true

			}
		}
		return false;  // if num not found so return false
	}
}
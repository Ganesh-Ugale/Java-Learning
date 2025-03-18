/*
A Sunny Number is a number where adding 1 to it results in a perfect square.

Example:
8 → 8 + 1 = 9 (which is 3²) ✅ Sunny Number
24 → 24 + 1 = 25 (which is 5²) ✅ Sunny Number
10 → 10 + 1 = 11 (not a perfect square) ❌ Not a Sunny Number
So, a Sunny Number follows the condition:
(Number + 1) should be a perfect square 🚀
*/

import java.util.Scanner;
class P11_SunnyNumCheck{
	public static void main(String[] args) {

		System.out.print("\nEnter the Num : ");
		int num = new Scanner(System.in).nextInt();
		boolean flag = false;  // initially we Assume the given num is not a sunny num

		int sunny = num + 1; // apply sunny num logic if num + 1 = perfect square of any num

		// check each num sqare with sunny
		for (int i = 1; i <= num; i++) {
			int prod = i * i; // take the square of num
			if (sunny == prod){  // compare the sunny with product of num
				flag = true; // if condition is true then flag becomes true
				break;  // then break the loop
			}
		}
		System.out.println  // if flag is true then num is Sunny Num otherwise not
		(flag ? num + " is a Sunny Num!" : num + " is Not a Sunny Num!");
	}
}
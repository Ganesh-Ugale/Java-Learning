/*
An Ugly Number is a number whose only prime factors are 2, 3, and 5.

Example:
✅ Ugly Numbers: 1, 2, 3, 4, 5, 6, 8, 10, 12... (Only factors are 2, 3, or 5)
❌ Not Ugly Numbers: 7, 11, 13, 14... (They have other prime factors like 7, 11, etc.)

💡 Key Point: 1 is considered an Ugly Number by definition. 🚀
*/

import java.util.Scanner;
class P18_UglyNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		System.out.println(num + " is Ugly Num? : " + isUgly(num));
	}
	// METHODS
	public static boolean isUgly(int num){
		while (num != 1) {
			if (num%2 == 0)
				num /= 2;
			else if (num%3 == 0)
				num /= 3;
			else if (num%5 == 0)
				num /= 5;
			else
				return	false;
		}
		return true;
	}
}


// Check the Range of Ugly Num

// class P18_UglyNumCheck{
// 	public static void main(String[] args) {

// 		// Check the Ugly Num in range 1 to 1000.
// 		for (int i = 1; i <= 1000; i++)
// 			if (isUgly(i))
// 				System.out.print(i + " ");
// 	}
// 	// METHODS
// 	public static boolean isUgly(int num){
// 		while (num != 1) {
// 			if (num%2 == 0)
// 				num /= 2;
// 			else if (num%3 == 0)
// 				num /= 3;
// 			else if (num%5 == 0)
// 				num /= 5;
// 			else
// 				return	false;
// 		}
// 		return true;
// 	}
// }
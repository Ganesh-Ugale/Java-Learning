/*
A Happy Number is a number that eventually reaches 1 when you repeatedly replace it with the sum of the squares of its digits. If it falls into a cycle that never reaches 1, it is called an Unhappy (or Sad) Number.

Example:

19 → 1² + 9² = 1 + 81 = 82
82 → 8² + 2² = 64 + 4 = 68
68 → 6² + 8² = 36 + 64 = 100
100 → 1² + 0² + 0² = 1 ✅ (Happy Number)
*/

import java.util.Scanner;
class P08_HappyNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		if (isHappy(num))
			System.out.println(num + " is Happy Num!");
		else
			System.out.println(num + " is Unhappy Num!");
	}

	// METHODS
	// To check the num is Happy
	public static boolean isHappy(int num){
		int sum = sumOfSqOfDigits(num);
		while (sum != 1 && sum != 4) {
			sum = sumOfSqOfDigits(sum);
		}
		return sum == 1 ? true : false;
	}
	// to find the sum of sq of individual digits
	public static int sumOfSqOfDigits(int num){
		int sum = 0;
		for (int i = num; i > 0; i /= 10) {
			int last = i % 10;
			sum += (last * last);
		}
		return sum;
	}
}
/*
LCM (Least Common Multiple) of two or more numbers is the smallest number that is divisible by all the given numbers.
Example:
Find LCM of 4 and 6
Multiples of 4: 4, 8, 12, 16, 20, ...
Multiples of 6: 6, 12, 18, 24, ...
👉 The smallest common multiple is 12. So, LCM(4,6) = 12 ✅

LCM is useful in fractions, scheduling problems, and number theory. 🚀
*/

import java.util.Scanner;
class P14_LCM{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("\nEnter num2 : ");
		int num2 = sc.nextInt();
		System.out.println("LCM is : " + Lcm(num1, num2));
	}
	// METHODS
	public static int Lcm(int num1, int num2){
		int max = (num1 > num2)?(num1):(num2);  // First Find the Max Num, bcz the max num multiple comes 1st i.e least that divisible by both Num

		int i = 1;
		while (true) { // run loop infinite bcz we dont know when num meets
			if ((max*i) % num1 == 0 && (max*i) % num2 == 0) // Check the max num multiples is divisible by both the nums if true so that num is LCM of given 2 num's
				return (max * i); // Print one that multiple
			i++;
		}
	}
}
/*
Check Whether the Num is Armstrong Num OR Not Using Methods
Ex:
153 → 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
370 → 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370
num == sum;
if yes then it is a armstrong num
*/

import java.util.Scanner;
class P05_ArmstrongNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println
		(powSum(num) == num ? num + " is Armstrong Num!" : num + " is Not Armstrong Num!");
	}

	// METHODS
	// Find the length/cnt of Num
	public static int cnt (int num){
		int i = num, cnt = 0;
		while (i > 0) {
			cnt++;
			i /= 10;
		}
		return cnt;
	}

	// Find the Power Sum
	public static int powSum(int num){
		int i = num, sum = 0;
		while (i > 0){
			int pow = 1;
			for (int j = 1; j <= cnt(num) ; j++) {
				pow *= i % 10;
			}
			sum += pow;
			i /= 10;
		}
		return sum;
	}
}
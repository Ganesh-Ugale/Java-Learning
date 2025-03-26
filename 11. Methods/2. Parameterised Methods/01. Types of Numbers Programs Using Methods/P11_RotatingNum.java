/*
Write an Program of Rotating Num Using Methods
Ex:
I/P = 1234
O/P = 4123
*/

import java.util.Scanner;
class P11_RotatingNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println(rotate(num));
	}

	// METHODS
	// Find the len of Num
	public static int cnt (int num){
		int i = num, cnt = 0;
		while (i > 0) {
			cnt++;
			i /= 10;
		}
		return cnt;
	}

	// Find the Power
	public static int pow (int num, int cnt){
		int pow = 1;
		for (int i = 1; i <= cnt; i++) {
			pow *= num;
		}
		return pow;
	}

	// Find the rotation of Num
	public static int rotate(int num){
		int lastDigit = num % 10;
		num /= 10;
		return (lastDigit * pow(10, cnt(num))) + num;
	}
}
/*
Write an Program of Rotations of roateted Num Using Methods
Ex:
I/P = 1234
O/P = 4123
	  3412
	  2341
	  1234
*/

import java.util.Scanner;
class P07_FindRotationsofNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int ct = cnt(num); // store the len of num in ct
		int rotate = rotate(num); // store the 1st roatation of num

		do{
			System.out.println(rotate);  // 1st Print the 1st Rotation of Num
			rotate = rotate(rotate); // update the roation by new rotation
			ct--;
		}while(ct > 0); // Loop run till the num len
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
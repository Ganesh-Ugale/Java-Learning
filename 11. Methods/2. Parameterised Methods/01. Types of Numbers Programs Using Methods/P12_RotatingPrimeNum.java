/*
Write an Program of Rotating Prime Num Using Methods
Ex:
I/P = 1234
Process = 
	  4123
	  3412
	  2341
	  1234
	  Check the all Rotations are prime or not 
O/P = 1234 is a Rotating Prime Num / 123 is not a Rotating Prime num.
*/

import java.util.Scanner;
class P12_RotatingPrimeNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.println
		(isRotatingPrime(num) ? num + " is a Rotating Prime Num!" : num + " is not a Rotating Prime Num!");
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

	// Prime Num Check
	public static boolean isPrime(int num){
		int din = 2;
		while (din < num) {
			if (num % din == 0)
				return false;
			din++;
		}
		return true;
	}

	// Check the Rotating num is Prime
	public static boolean isRotatingPrime(int num){
		++cnt;
		if (isPrime(num)) { // check First the num is prime then proceeds
			int rot = rotate(num); // rotate the num 
			while (rot != num && isPrime(rot)) { // run loop until the rot != num and each rotation checks isPrime
				rot = rotate(rot); // updates the rot by rotation of itself
			}
			return num == rot;  // Check the num == rot 
		}
		return false;  // if num is not prime so returns false
	}
}
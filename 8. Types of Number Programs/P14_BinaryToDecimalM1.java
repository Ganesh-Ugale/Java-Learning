/* Method- 1
	Write an Program to Convert the Binary num into Decimal num
	Ex:
	I/P = 1101
	O/P = 13
*/

import java.util.Scanner;
class P14_BinaryToDecimal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Num : ");
		long bin = sc.nextLong(); // take the i/p in long

		int decimal = 0, power = 0;  // initially decimal is 0 and power is also 0, bcz wew fetch from the last digit and last digit must start the 2 pow 0
		for (long i = bin; i > 0; i/=10) { // each time remove the last num
			long lastDigit = i % 10; // to fetch the last digit from the bin
			decimal += lastDigit * Math.pow(2, power); // lastdigit * 2^power
			power++;  // each time power++ bcz we start converting the binary to decimal from last digit
		}
		System.out.println(decimal); // complete Deciaml Num Print
	}
}
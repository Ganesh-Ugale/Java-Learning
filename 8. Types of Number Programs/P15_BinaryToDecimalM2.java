/* Method- 2
	Write an Program to Convert the Binary num into Decimal num using Built in Method
	Ex:
	I/P = 1101
	O/P = 13
*/

import java.util.Scanner;
class P15_BinaryToDeciamlM2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Binary Num : ");
		String bin = sc.next();

		int decimal = Integer.parseInt(bin, 2); // Convert the Bin to Decimal using built in method

		System.out.println(bin + " in Decimal : " + decimal);
	}
}
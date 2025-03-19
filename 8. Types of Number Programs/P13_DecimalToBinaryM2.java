/* Method- 2
	Write an Program to Convert the Decimal num into Bin num Using Built in method.
	Ex:
	I/P = 13
	O/P = 1101
*/

import java.util.Scanner;
class P13_DecimalToBinary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the Deciaml Num : ");
		int decimal = sc.nextInt();

		String bin = Integer.toBinaryString(decimal); // toBinaryString is an Built in method of Integer Wrapper class.
		System.out.println(bin);
	}
}
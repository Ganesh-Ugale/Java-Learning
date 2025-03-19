/* Method- 1
	Write an Program to Convert the Decimal num into Bin num
	Ex:
	I/P = 13
	O/P = 1101
*/

import java.util.Scanner;	
class P12_DecimalToBinary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int decimal = sc.nextInt();
		String rev = ""; // for to store the bin num in reverse

		// find the bin num till num becomes 0
		for (int i = decimal; i > 0; i /= 2) {  // updates loop by i = i /2 means each time new division ans is divisible by 2
			int bin = i % 2;  // each time i % 2 the rem is the bin stores in bin var
			rev = bin + rev; // store the bin num in rev order
		}
		System.out.println(rev); // Print the bin num
	}
}
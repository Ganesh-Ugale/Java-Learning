/* To Check Whether the Entered Num is automorphic Num or Not

Hint: An Automorphic Number is a number whose square ends with the same     
      digits as the number itself.
Ex: 5 --> 5^2 = 25 (Ends with 5)
	6 --> 6^2 = 36 (Ends With 6)
	25 --> 25^2 = 625 (Ends with 25)
Ex:
I/P = 25
Check = 25 x 25 = 625 % 100 == 25
Output = 25 is a Automorthik Num!

*/

import java.util.Scanner;
class P04_AutomorphicNumCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Num : ");
		int num = sc.nextInt();
		int len = 0;
		int div = 1; // Initially Div is 1

		for (int i = num; i > 0; i/=10) // To Count the Length
			len++;

		for (int i = 1; i<=len; i++) // To Increase the Divisor by it's Length
			div *=10;

		System.out.println // Check the Origianl Num == it's sqr with last digit of the num
		(num == (num*num)%div ? num + " is Automorphic Num!" : num + " is not Automorphic Num!");
	}
}
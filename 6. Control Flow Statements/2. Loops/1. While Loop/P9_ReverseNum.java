/*
 * Reverse the User Entered Num using While Loop
 * Ex:
 * Num = 123
 * O/P = 312
*/

import java.util.Scanner;
class ReverseNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		int rem, rev = 0;

		while (num>0)
		{
			rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		System.out.print(rev);
	}
}
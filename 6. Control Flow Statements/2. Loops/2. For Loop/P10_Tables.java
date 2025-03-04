/*
 * Print the Tables using For Loop
 */

import java.util.Scanner;
class Tables
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Table Num : ");
		int num = sc.nextInt();	
		System.out.print("Enter the Range : ");
		int range = sc.nextInt();

		for (int i = 1;i<=range ;i++ )
		{
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
}
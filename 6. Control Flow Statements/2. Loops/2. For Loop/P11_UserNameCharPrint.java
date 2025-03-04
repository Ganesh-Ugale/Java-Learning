/*
Program to Print the user name char using for loop
 */

import java.util.Scanner;

class UserNameCharPrint
{
	public static void main(String[] args)
	{
		System.out.print("Enter User Name : ");
		String userName = new Scanner(System.in).next().toUpperCase();
		int len = userName.length();
		
		System.out.print("\nINDEX  CHAR\n");
		for ( int i = 0; i < len ;i++ )
		{
			System.out.println("  "+i + "  :   " + userName.charAt(i));
		}
	}
}
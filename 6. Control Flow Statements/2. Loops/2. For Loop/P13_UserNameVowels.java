/*
Print the Vowels in the User Entered String
Ex:
String = Ganesh;
O/P = a e
*/

import java.util.Scanner;
class UserNameVowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter User Name : ");
		String name = sc.next().toUpperCase();
		int len = name.length();
		System.out.print("\nVowels: ");

		for (int i = 0; i < len; i++ )
		{
			char ch = name.charAt(i);
			if (ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U')
			{
				System.out.print("| " + ch + " ");
			}
		}
		System.out.print("|");
	}
}
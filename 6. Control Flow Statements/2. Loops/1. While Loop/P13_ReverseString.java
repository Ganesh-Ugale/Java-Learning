/*
To Reverse String and Print
Ex:
input = GANESH ||OR|| MADAM
Reverse = HSENAG ||OR|| MADAM
*/

import java.util.Scanner;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n===============================|| WELCOME ||===============================\n");
		System.out.print("\nEnter the String : ");
		String str = sc.next().toUpperCase(); // Take the input and convert it into UpperCase

		int len = str.length(); // To get a String lenght
		String newString = ""; // For Storing a Reverse String

		for (int i = 0; i < len ; i++ ) // Loops Starts from 0 to len - 1, bcz char starts from index 0.
		{
			char ch = str.charAt(i); // To fetch the char at index i
			newString = ch + newString; // To store the new char then old string, stores from left to right i.e ch + newString then it assign to newString.
		}
		System.out.println("\nReverse String is " + newString);
	}
}
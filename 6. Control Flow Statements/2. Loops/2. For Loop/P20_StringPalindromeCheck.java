/*
To Check the String is Palindrome or not
Ex:
input = GANESH ||OR|| MADAM
Reverse = HSENAG ||OR|| MADAM
output =  HSENAG is not Palindrome ||OR|| MADAM is Palindrom
*/

import java.util.Scanner;
class StringPalindromeCheck
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

		if (str.equals(newString)) // To Compare the String to newString using equals method
		{
			System.out.println("String " + str + " is Palindrome!\n");
		}
		else
		{
			System.out.println("String " + str + " is Not Palindrome!\n");
		}
	}
}
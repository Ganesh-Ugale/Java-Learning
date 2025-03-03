/*
To Check the Num is Plindrome or not!
Ex:
Intput = 121
output = 121 is a Palindrome num!
*/

import java.util.Scanner;
class NumPalindromeCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n===============================|| WELCOME ||===============================\n");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt(); 

		int revNum = 0, originalNum = num;
		
		while (num>0) // To Compare num each time bcz Loop Decreases
		{
			int rem = num % 10; // To Fetch the last Num
			revNum = (revNum * 10) + rem; // To Store the Num as reverse
			num /= 10; // to update the Loop(remove the last Num)
		}
		System.out.println("\nReverse Num is : " + revNum);

		if (revNum == originalNum) // To Check or Compare the reverse Num and Original Num is same or not
		{
			System.out.print(originalNum + " is Palindrome Num!\n");
		}
		else
		{
			System.out.print(originalNum + " is Not Palindrome Num!\n");
		}
	}
}
/*
 * Leap Year Check using if else Statement
 */

import java.util.Scanner;
class LeapYearCheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the year(YYYY) : ");
		short year = sc.nextShort();

		// For Valid Year Check
		if (year<=0)
		{
			System.out.println("INVALID YEAR!");
			return;
		}

		// To Check the Year is Leap OR Not
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + " is a Leap Year!");
		}
		else{
			System.out.println(year + " is Not a Leap Year!");
		}
	}
}
/*
 Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 */


import java.util.Scanner;

class MinToYears
{
	public static void main(String[] args)
	{

		System.out.print("Enter the Number of Minutes: ");
		long userMin = new Scanner(System.in).nextLong();

		final long minInYear = (365*24*60);
		long totalYears = userMin/minInYear;

		long minInDay = (24*60);
		long remMin = userMin%minInYear;
		//System.out.println("remMin: " + remMin);
		long totalDays = remMin/minInDay;

		System.out.println(totalYears + " Years " + " & " + totalDays + " Days.");


	}
}
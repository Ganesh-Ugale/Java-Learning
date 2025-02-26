/*
 * Program to Covert the Min to Years using Final Keyword
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
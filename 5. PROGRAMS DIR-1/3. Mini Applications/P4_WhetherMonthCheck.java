/*
Season with Month Check Using the Ternary Operator an Mini Application
 */

import java.util.Scanner;

class WhetherMonthCheck
{
	public static void main(String[] args)
	{
		System.out.print("Enter Month: ");
		String month = new Scanner(System.in).next().toUpperCase();

		String op = (month.equals("OCT") || month.equals("NOV")
			|| month.equals("DEC")|| month.equals("JAN"))?(month + " WINTER"):
			((month.equals("FEB")||month.equals("MAR")||month.equals("APR")
			||month.equals("MAY"))?(month + " SUMMER"):((month.equals("JUN")
			||month.equals("JUL")||month.equals("AUG")||month.equals("SEP")?
			(month + " MONSOON"):("INVALID DATA"))));
		System.out.println(op);
	}
}
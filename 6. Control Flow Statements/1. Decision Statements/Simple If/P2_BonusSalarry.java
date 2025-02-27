/*
Write an Program of Bonus Salary Amount Using Simple if Statement
 */

import java.util.Scanner;

class BonusSalarry
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Salarry : ");
		float sal = new Scanner(System.in).nextFloat();

		if(sal>5000)
		
			sal+=(5000*15)/100;
		
		System.out.println("Your Final Salarry : " + sal);
	}
}
/*
Find the Factors of Num 
Ex:
Input Num = 20;
Output Num = 1 2 4 5 10 20;
*/

import java.util.Scanner;
class FindFactorsofNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n============================|| FACTORS OF NUM ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		System.out.print("\nFactors of Num " + num + " are : ");

		for (int i = 1; i<=num ; i++ )
		{
			if (num%i==0) // Check the num is divisible by i or not
			{
				System.out.print(i + " ");
			}
		}
	}
}
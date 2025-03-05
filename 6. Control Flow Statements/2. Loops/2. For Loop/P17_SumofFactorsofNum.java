/*
To calculates the sum of all factors of num
Ex:
input = 10
sum = 1+2+5+10
Output = 18
*/

import java.util.Scanner;
class SumofFactorsofNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF FACTORS ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int sum = 0;
		
		System.out.print("\nFactors are: ");
		for (int i = 1; i<=num ; i++ )
		{
			if (num % i == 0)
			{
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\nSum of the Factors is " + sum);
	}
}
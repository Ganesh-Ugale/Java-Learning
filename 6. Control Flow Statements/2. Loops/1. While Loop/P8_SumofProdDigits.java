/*
Find the Sum of Prod of digits using While Loop
EX:
Num = 123;
Output = 6
*/


import java.util.Scanner;
class SumofProdDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF DIGITS PRODUCT ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int prod = 1, dup = num;
		while (num>0)
		{
			int rem = num % 10;
			prod *= rem;
			num /= 10;
		}
		System.out.println("Sum of Prod of Digits " + dup + " is: " + prod);
	}
}
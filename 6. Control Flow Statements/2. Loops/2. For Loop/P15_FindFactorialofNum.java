/*Find the Factorial of a given num.
Ex: num = 5 
Factorial = 5x4x3x2x1 = 120
*/

import java.util.Scanner;
class FindFactorialofNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| FACTORIAL OF NUM ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int fact = 1;

		for (int i = num; i >= 1; i-- )
		{
			fact *= i; // fact = fact * i
		}
		System.out.println("\nFactorial of Num " + num + "! is " + fact);
	}
}
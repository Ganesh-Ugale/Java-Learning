/*
Find the Sum of Factorial Digits
Ex:
Input Num  = 123
factorialSum = 1!+2!+3!
Output = 1+2+6 = 9
*/

import java .util.Scanner;
class FactorialDigitsSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF EACH DIGIT FACTORIAL NUM ||============================");
		System.out.print("\nEnter Num : ");
		int num = sc.nextInt();
		int sum = 0;

		// While loop helps to update the num
		while (num>0)
		{
			int rem = num % 10; // To fetch only one num from original Num means fetch only last digit each time
			int fact = 1; // Each time fact var reset

			// for loop helps to calculate the factorial of a rem num
			for (int i = rem; i >= 1 ;i-- )
			{
				fact *= i;
			}
			sum += fact; // Sum of the factorial of rem num
			num /= 10; // update the num means remove last digit each time
		}
		System.out.println("Sum of Each Digit Factorial is : " + sum);
	}
}
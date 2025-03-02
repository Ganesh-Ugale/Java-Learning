/*
Find the Sum of Factorial digits
Ex:
num = 5!;
fact = 5x4x3x2x1 = 120
sum = 1+2+0 = 3
Output = 3
*/
import java.util.Scanner;
class FactorialNumSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF FACTORIAL NUM ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int fact = 1, dup = num, sum = 0;
		
		// To find the Factorial
		while (num>=1)
		{
			fact *= num;
			num--;
		}
		System.out.println("Factorial of num " + dup + "! is " + fact);

		// To Find the Sum of Factorial
		while (fact>0)
		{
			int rem = fact % 10;
			sum += rem;
			fact /= 10;
		}
		System.out.println("Sum of Factorial num is " + sum);		
	}
}
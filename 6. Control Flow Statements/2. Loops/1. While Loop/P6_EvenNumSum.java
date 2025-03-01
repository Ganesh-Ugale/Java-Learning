/*Sum of Even Num's Only from the given num
Ex:
Input num = 1234
Sum = Even num's Only (2 & 4)
Output: 6
*/

import java.util.Scanner;
class EvenNumSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF EVEN NUM ONLY ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) 
		{
			int rem = num % 10;
			if (rem % 2 == 0)
			{
				sum += rem;
			}
			num /= 10;
		}
		System.out.println("\nSum of Even Num's is : " + sum);
	}
}
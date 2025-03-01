/*Sum of Even & Odd Num's Only from the given num
Ex:
num = 1234
Sum = Even num's Only (2 & 4)
Sum = Odd num's Only (1 & 3)
Output: Even Num Sum: 6
		Odd Num Sum: 4
*/

import java.util.Scanner;
class EvenNumSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| SUM OF EVEN & ODD NUM ||============================");
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int evenSum = 0, oddSum = 0;

		while (num > 0) 
		{
			int rem = num % 10;
			if (rem % 2 == 0)
			{
				evenSum += rem;
			}
			else{
				oddSum += rem;
			}
			num /= 10;
		}
		System.out.println("\nSum of Even Num's is : " + evenSum);
		System.out.println("Sum of Odd Num's is : " + oddSum);
	}
}
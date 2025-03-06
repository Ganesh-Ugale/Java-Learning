/*
Find the Largest Digit from input num.
input = 4562831;
output = 8;
*/


import java.util.Scanner;
class FindLargestNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int max = 0; // initially max is 0

		for (int i = num; i > 0 ; i /= 10 ) // Loop starts from num & ends when num becomes 0
		{
			int  digit = i % 10; // to fetch the last digit

			if (max < digit) // Compare the max with last fetched digit
			{
				max = digit; // update the max means re-initialized
			}
		}
		System.out.println("\nLargest Num from " + num + " is " + max);
	}
}
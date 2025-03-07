/*
To print the Least repeated smallest num with frequency og digit from the num
Ex:
input = 1234322322;
Output = 1:1
*/


import java.util.Scanner;
class LeastRepetingDigit
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);

		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();

		int min = 9;
		int digit = 0;


		for (int i = 0; i <= 10 ; i++ )
		{
			int count = 0;
			for (int j = num ; j > 0 ; j /= 10 )
			{
				int rem = j % 10;
				if (rem == i)
				{
					count++;
				}
			}
			if (count != 0)
			{
				if (min > count)
				{
					min = count;
					digit = i;
				}
			}
		}
		System.out.println("Least Reapeted & Smallest degit is " + digit + " with freqency : " + min);
	}
}
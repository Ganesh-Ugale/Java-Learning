/*
To Print the Prime Factos from factors of num.
Ex:
input = 20
factors = 2 4 5 10
Output = 2 5
*/

import java.util.Scanner;
class PrimeFactors
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		

		for (int i = 2; i<num ;i++ )
		{
			if (num % i == 0)
			{
				int din = 2;
				while (din<i)
				{
					if (i % din == 0)
					{
						break;
					}
					din++;
				}

				if (i==din)
				{
					System.out.println(din);	
				}
			}
		}
	}
}
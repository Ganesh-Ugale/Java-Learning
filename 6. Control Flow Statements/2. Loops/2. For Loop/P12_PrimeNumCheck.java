/*
To Check the Num is Prime or Not from it's num of count of factors(factors means that num is not divisible by anyone exclude 1 and itself)
Ex:
input = 7 OR 4;
count = 0 OR 1;
output = Num is prime bcz no any factors OR num is prime bcz count is 1 
*/

import java.util.Scanner;
class PrimeNumCheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nFactors of Num : ");
		int num = sc.nextInt();
		int cnt = 0;

		for (int i = 2; i<num ; i++ ) // for Excepts 1 and num itself loop starts from 2 and upto num-1(i.e i<num)
		{
			if (num%i==0) // to check if the num is divisible by any num from 2 to num-1 so it true and count++ so that num have a factors so it is not a prime
			{
				cnt++; // count becomes ++ if condition is true
			}
		}
		
		System.out.println("\nCount: " + cnt);

		// if the count == 0 means it is a prime if not equal to zero then it is prime
		System.out.println(cnt == 0? num + " Num is Prime":num + " Num is Not Prime");
	}
}

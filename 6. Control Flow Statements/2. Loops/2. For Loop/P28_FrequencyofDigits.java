/*
To Count the Freqency of digit in num and print 
Ex:
intput = 115462454
output = 
1:2
2:1
4:3
5:2
6:1
*/

import java.util.Scanner;
class FrequencyofDigits
{
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		
		
		for (int i = 0 ; i <= 9 ; i++) // This Loop compares 0 to 9 digit to each digits inside the loop num
		{
			int count = 0; // Every time count becomes 0 reset;
			for (int j = num; j > 0 ; j /= 10 ) // This Loop compares each digit to outer side one digit
			{
				int digit = j % 10; // to fetch the last digit of num
				if (digit == i) // compares each digit to digit i
				{
					count++; // if condition is true then only count++
				}
			}
			if (count != 0) // if count != 0 then only print
				System.out.println(i + ":" + count);
		}
	}
}
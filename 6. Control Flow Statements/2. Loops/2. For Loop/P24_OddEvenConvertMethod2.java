/*
Count the length of the given num and identify the num length is even or Odd,
if the length is even then convert the each digit of num in even, vice versa for odd lenth num

Ex:
intput = 1234 ||OR|| 123
output = 2244 ||OR|| 133
*/

import java.util.Scanner;
class OddEvenConvertMethod2
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter a number : ");
		int num = new Scanner (System.in).nextInt();

		int cnt = 0;
		int result = 0;
		int rev = 0;
	
		for (int i = num; i > 0 ; i /= 10 ) // for count a num length
		{
			cnt++;
		}

		if (cnt % 2 == 0) // Check the Count is Even
		{
			System.out.println("The number is of Even length that is " + cnt);
			System.out.print("The updated number : ");
			while(num>0)
			{
				if ((num % 10) % 2 == 0) // Check the last digit of num is even
				{
					rev = num % 10; // if last digit is even so remains as it is. do not change
				}
				//else if((num % 10) % 9 == 0) // if you wait to make the digit 9 even as 8 or 2, so open this loop. bcz Ex user input 1239 so it gives o/p 22401 that means it makes 9 as 01, so if you use this loop we can assign any value if 9 comes in the num
				//{
				//	rev = 2;
				//}
				else if ((num % 10) % 2 != 0) // Check the last digit of num is Odd
				{
					rev = (num % 10) + 1 ; // if last digit is odd so add + 1 in that num.
				}
				result =  (result * 10) + rev; // To store the num in result var as result = Old + newNum
				num /= 10; // update means remove the last digit
			}
		}
		
		else if (cnt % 2 != 0) // Check the count is Odd
		{
			System.out.println("The number is of Odd length that is " + cnt);
			System.out.print("The updated number : ");
			while (num > 0)
			{
				if ((num % 10) % 2 == 0) // Check the last digit of num is even
				{
					rev = (num % 10) + 1 ; // if last digit is Even so add + 1 in that num.
				}
				else if ((num % 10) % 2 != 0) // Check the last digit of num is Odd
				{
					rev = num % 10; // if last digit is Odd so remains as it is. do not change
				}
				num /= 10; // Update means remove the last digit
				result =  (result * 10) + rev; // To store the num in result var as result = Old + newNum
			}
		}

		while(result > 0) // To print revese result in right manner again means if above reverse result 4231 then make it 1234
		{
			System.out.print(result % 10); // to fetch the last digit
			result /= 10; // update the num to remove the last digit
		}
	}
}
/*
Count the length of the given num and identify the num length is even or Odd,
if the length is even then convert the each digit of num in even, vice versa for odd lenth num

Ex:
intput = 1234 ||OR|| 123
output = 2244 ||OR|| 133
*/

import java.util.Scanner;
class NumPlusOne
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n=======================|| CONVERT EVEN TO ODD & ODD TO EVEN ||=======================");
		System.out.print("\nEnter the Num : ");
		String num = sc.next();

		int len = num.length();
		
		System.out.print("\nModefied Num: ");
		for (int i = 0; i<len ; i++ )
		{
			if (len % 2 == 0)
			{
				char ch = num.charAt(i);
				if (ch % 2 == 0)
				{
					System.out.print((ch-'0') + " ");
				}
				else
				{
					System.out.print(((ch+=1)-'0') +" ");
				}
			}
			else
			{
				char ch = num.charAt(i);
				if (ch % 2 == 0)
				{
					System.out.print(((ch+=1)-'0') + " ");
				}
				else
				{
					System.out.print((ch-'0') + " ");
				}
				
			}
		}
	}
}
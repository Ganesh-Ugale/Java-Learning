/*
To calculate the num from it's power i.e Square or Cube of num
Ex:
input = 2 |OR| 2
power = 2 |OR| 3

output = 4(square of 2) |OR| 8(Cube of 2)

i.e in simple words
2^2(pow) = 4 --> square of 2
2^3(pow) = 8 --> cube of 2
*/

import java.util.Scanner;
class PowerofNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num : ");
		int num = sc.nextInt();

		System.out.print("Enter Power : ");
		int pow = sc.nextInt();

		int op = 1;

		for (int i = 1;i<=pow ;i++ ) // starts loop from 1 and stops until power 
		{
			op*=num; // op = op * num
		}
		System.out.println(num + "^" + pow + " = " + op);

	}
}
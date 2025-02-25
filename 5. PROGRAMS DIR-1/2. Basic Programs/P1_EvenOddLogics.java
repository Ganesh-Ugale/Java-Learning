/*
	* Check the Num is Even or Odd There are 3 Logics to Check the Num is Even or Odd
 */

import java.util.Scanner;
class EvenOddWithoutLogics
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Num: ");
		int num = new Scanner(System.in).nextInt();

		System.out.println(num%2 == 0); // Logic- 1
		System.out.println((num/2) == (num/2.0)); // Logic- 2
		System.out.println((num/2)*2 == num); // Logic- 3
    }
}
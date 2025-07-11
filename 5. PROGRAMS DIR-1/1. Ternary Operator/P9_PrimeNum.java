/*
  Check the Entered Num is Prime Or Not Using Ternary Operator
 */

import java.util.Scanner;

class PrimeNum
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Num : ");
		int num = new Scanner(System.in).nextInt();
		
		String primeNum = (num==1)?("1 is not prime number"):(num==2 || num==3)?(num+"is Prime"):
		((num%2==0 || num%3==0)?(num+"is not Prime"):(num+"is Prime"));
		System.out.println(primeNum);
	}
}
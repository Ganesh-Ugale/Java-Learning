/*
 * Write an Program to Dispay a Message from user enterd num or digit Like 2 for HiTwo 5 for HiFive and 25 for HiTwoFive using Ternary Operator
 */
import java.util.Scanner;

class HiNum
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Num : ");
		int num = new Scanner(System.in).nextInt();

		String op = ((num%2==0)&&(num%5==0))?("HiTwoHiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):((num%2!=0 && num%5 !=0)?("_"):("_"))));
		System.out.println(op);
	}
}
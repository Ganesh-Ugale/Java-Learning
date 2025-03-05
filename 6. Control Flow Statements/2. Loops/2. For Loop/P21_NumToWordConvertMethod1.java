/*
METHOD- 1
Convert the Num into Words. 
Input = 123
Output = one two three
*/

import java.util.Scanner;
class NumToWordMethod1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num : ");
		int userNum = sc.nextInt();
		int rev = 0, rev2 = 0;
		
		while (userNum>0)
		{
			int rem = userNum % 10;
			rev = (rev * 10) + rem;
			userNum /= 10;
		}

		for (int i = rev; i>0 ; i/=10 )
		{
			int rem1 = i % 10;

			switch (rem1)
			{
			case 0: System.out.print("ZERO "); break;
			case 1: System.out.print("ONE "); break;
			case 2: System.out.print("TWO "); break;
			case 3: System.out.print("THREE "); break;
			case 4: System.out.print("FOUR "); break;
			case 5: System.out.print("FIVE "); break;
			case 6: System.out.print("SIX "); break;
			case 7: System.out.print("SEVEN "); break;
			case 8: System.out.print("EIGHT "); break;
			case 9: System.out.print("NINE "); break;
			default: System.out.print("INVALID NUM! "); break;
			}
		}
	}
}
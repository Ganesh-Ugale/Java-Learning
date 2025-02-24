/*
 * Find the Sum Even and Odd Nums from User Entered 4 Digit Num
 */

import java.util.Scanner;

class EvenOddSum
{
	public static void main(String[] args)
	{
		System.out.print("Enter 4 digit num: ");
		int userNum = new Scanner(System.in).nextShort();

		int evenNum = 0, oddNum = 0, temp, lastNum;

		lastNum = userNum % 10;
		temp = (lastNum % 2 == 0)?(evenNum = evenNum + lastNum):(oddNum = oddNum + lastNum);
		userNum = userNum / 10;

		lastNum = userNum % 10;
		temp = (lastNum % 2 == 0)?(evenNum = evenNum + lastNum):(oddNum = oddNum + lastNum);
		userNum = userNum / 10;
		
		lastNum = userNum % 10;
		temp = (lastNum % 2 ==0)?(evenNum = evenNum + lastNum):(oddNum = oddNum + lastNum);
		userNum = userNum /10;
		
		lastNum = userNum % 10;
		temp = (lastNum % 2 ==0)?(evenNum = evenNum + lastNum):(oddNum = oddNum + lastNum);

		System.out.println("Even Num Addition: " + evenNum);
		System.out.println("Odd Num Addition: " + oddNum);


	}
}
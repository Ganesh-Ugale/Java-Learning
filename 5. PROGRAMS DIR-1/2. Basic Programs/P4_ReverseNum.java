/*
	Program to Reverse a  3 Digit Num
 */

class ReverseNum
{
	public static void main(String[] args)
	{
		int userNum = 123;
		int dupNum = userNum;
		int reverseNum = 0;

		int reminder = userNum % 10; // return a last num
		reverseNum = reverseNum * 10 + reminder; // to store the num
		userNum = userNum/10; // now remove the last used Num

		reminder = userNum % 10;
		reverseNum = reverseNum * 10 +reminder;
		userNum = userNum / 10;

		reminder = userNum % 10;
		reverseNum = reverseNum * 10 + reminder;

		System.out.println(dupNum + " Reversed is " + reverseNum);
	}
}
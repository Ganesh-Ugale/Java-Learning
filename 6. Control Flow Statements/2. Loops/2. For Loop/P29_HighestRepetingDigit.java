/*
To print the highest num of frequency digit from the num
Ex:
input = 1234322322;
Output = 2:5
*/

import java.util.Scanner;
class HighestRepetingDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		int max = 0;
		int digit = 0;

		for (int i = 0 ; i <= 9 ; i++ ) // compares digits from 0 to 9
		{
			int count = 0; // counts initially 0 and reset everytime
			for (int j = num ; j > 0 ; j /= 10 ) // Iterates loop and updates by removing last digit
			{
			    int rem = j % 10; // fetch the last digit from num
				if (rem == i) // compare rem digit to outer loop digit i
				{
					count++; // if condition is true then count++;
				}
			}
			if (count != 0) // after nested loop over then check condition if count != 0 then again check the condition max < count if yes then assign count++ value to max var and i value to the digit var
			{
				if (max < count) //Compare is max < counts
				{
					max = count; // assign the count to max
					digit = i; // asign the i to digit
				}
			}
		}
		System.out.println("Largest Num is " + digit + " with frequency: " + max);
	}
}
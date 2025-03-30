/*
Program to Count the num of digits in the num i.e length of num
Ex:
I/P = 1234554321
O/P = Count is 10
*/

import java.util.Scanner;
class P07_CountDigitsLength{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the num : ");
		int num = sc.nextInt();
		System.out.println("Count is : " + count(num, 0));
	}
	// METHODS
	public static int count(int num, int count){
		if (num > 0) // if num > 0 then return call count()
			return count(num /= 10, ++count); // here each time num update and cnt++
		return count; // if condition is false then return count

		// return (num > 0)?(count(num /= 10, ++count)):(count); // using Optimized Method
	}
}
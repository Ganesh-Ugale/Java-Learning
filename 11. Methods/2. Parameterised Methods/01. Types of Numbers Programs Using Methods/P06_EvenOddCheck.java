/*
Check the Num is Even or Odd without using conditional Statemtns and looping statemtns excluding if statement.
*/
import 	java.util.Scanner;
class P06_EvenOddCheck{
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is Even Num!");
			return; // return nothing, it distroys the frame from stake
		}
		System.out.println(num + " is Odd Num!");
	}
}
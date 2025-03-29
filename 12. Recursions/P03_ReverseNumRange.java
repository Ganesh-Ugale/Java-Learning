/* 
Print the Range of Reverse Num 
Reverse the num using Recursion Method
I/P = start = 1
	  End = 100
O/P = Print the revese of all num in 1 to 100
*/

import java.util.Scanner;
class P03_ReverseNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start num : ");
		int start = sc.nextInt();
		System.out.print("\nEnter the end num : ");
		int end = sc.nextInt();

		// Loop to print the reverse of num in between range
		for (  ; start <= end; start++)
			System.out.println("Reverse Num is : " + reverse(start, 0));
		
	}

	// METHODS
	public static int reverse(int num, int rev){
		if (num != 0) {  // check num everytime is != 0 ?
			int last = num % 10;  // fetch the last num
			rev = (rev * 10) + last;  // add last in the rev order
			return reverse(num/10, rev); // again call itselft by updating num means remove last digit and give the updated rev.
		}
		return rev; // if condition false return the rev

		// return (num != 0)?(reverse(num/10, (rev * 10) + num % 10)):(rev); // OR Using Optimized Method
	}
}
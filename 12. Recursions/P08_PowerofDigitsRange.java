/* 
Print the Range Power of digits, Print the power of Digits in user Entered Range
Program to take the Power of Digits using Recursion Method.
Ex:
I/P = start = 1
	  End = 10
	  pow = 2
O/P = prints the pow of num in between 1 and 10
*/
import java.util.Scanner;
class P08_PowerofDigitsRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the start num : ");
		int base = sc.nextInt();
		System.out.print("\nEnter the end num : ");
		int end = sc.nextInt();
		System.out.print("\nEnter the Power : ");
		int power = sc.nextInt();

		// Loop to print the pow of digits in range
		for (  ; base <= end; base++)
			System.out.println(pow(base,power));
		
	}
	public static int pow(int base, int pow){
		if (pow == 0)
			return 1;
		return base * pow(base, pow - 1);

		// return (pow == 0)?(1):(base * pow(base, pow - 1)); // OR using Optimized Method
	}
}
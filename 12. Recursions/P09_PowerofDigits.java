/* Program to take the Power of Digits using Recursion Method.
Ex:
I/P = 2^5
O/P = 32
*/
import java.util.Scanner;
class P09_PowerofDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Base : ");
		int base = sc.nextInt();

		System.out.print("\nEnter the Power : ");
		int power = sc.nextInt();

		System.out.println(pow(base,power));
	}
	public static int pow(int base, int pow){
		if (pow == 0)
			return 1;
		return base * pow(base, pow - 1);

		// return (pow == 0)?(1):(base * pow(base, pow - 1)); // OR using Optimized Method
	}
}
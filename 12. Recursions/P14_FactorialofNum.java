/* Find the Factorial of Num using Recursions
Ex:
I/P = 5
O/P = 120
*/
import java.util.Scanner;
class P14_FactorialofNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Num : ");
		int num = sc.nextInt();
		// for (int i = 1; i <= 1000; i++)  // to find the range of factorial
			System.out.println(fact(i));
	}
	// Method using Recursion
	public static int fact(int num){
		if (num == 0)
			return 1;
		return num * fact(num - 1); // this method calling itselft here until the num == 0
		
		// return (num == 0)?(1):(num * fact(num - 1)); // OR Using Optimize Method
	}
}
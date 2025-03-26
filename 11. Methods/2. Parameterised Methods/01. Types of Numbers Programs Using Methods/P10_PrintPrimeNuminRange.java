/*
To Print the Prime Nums in range using Methods
Ex: I/P start = 50
		End = 100
	O/P = 53 59 61 67 71 73 79 83 89 97 
*/
import java.util.Scanner;
class P10_PrintPrimeNuminRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the Start Num : ");
		int sNum = sc.nextInt();
		System.out.print("\nEnter the Range : ");
		int range = sc.nextInt();

		for (int i = sNum; i <= range; i++)  // Loop for to print the prime num in range
			if (isPrime(i))  // if num is prime then print num
				System.out.println(i);
	}

	// METHODS
	// Checks the Num is Prime
	public static boolean isPrime(int num){
		int den = 2;
		while (den < num){
			if (num % den == 0)
				return false;
			den++;
		}
		return den == num;
	}
}
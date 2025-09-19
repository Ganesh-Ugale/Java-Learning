package abtractmodifier;

import java.util.Scanner;

public class NumberProDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		NumberPrograms n1 = new NumberProgramImp();
		
//		isPrime
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		
		if (n1.isPrime(num)) {
			System.out.println(num + " is Prime!");
		}
		else {
			System.out.println(num + " is not Prime!");
		}
		
		System.err.println("--------------------------------------------------");
		
//		Factorial
		System.out.print("Enter the Num : ");
		int num2 = sc.nextInt();
		
		System.out.println("Factorial of " + num2 + " is : " + n1.factorial(num2));
		
		System.err.println("--------------------------------------------------");

//		Power
		System.out.print("Enter the base and power(Ex: 2 5) : ");
		int base = sc.nextInt();
		int raise = sc.nextInt();
		
		System.out.print("Power of "+ base + "^" + raise + " is : " 
		+ n1.pow(base, raise));
		sc.close();
	}
}

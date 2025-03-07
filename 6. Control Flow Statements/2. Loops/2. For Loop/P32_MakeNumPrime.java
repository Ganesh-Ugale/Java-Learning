/*
To Make the userEntered num prime if Not
Input = 4 --> user enterd num is not prime
Output = 5 --> Program makes it Primes
 */

import java.util.Scanner;

class MakeNumPrime
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);

		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		int dup = num; 

		for (int i = 2 ; i < num ; i++){ // this loop divides every digit from 2 to num
			if (num % i == 0){ // checks num divides i ? if yes then executes block
				num++; // updates Num to check which is next prime num
				i=2;
			}
		}
		System.out.println("User Enterd Num : " + dup);
		System.out.println("Prime Num : " + num);
	}
}

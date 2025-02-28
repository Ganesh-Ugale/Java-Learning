/*
 * Create an Mini Application Using if elseif Ladder Statements
 */

import java.util.Scanner;
class CurrencyConverter1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n+---------------------------|| CURRENCY CONVERTER ||---------------------------+\n");
		System.out.print("Enter the Amount (INR) : ");
		float inrCurr = sc.nextFloat();

		System.out.println("\n1. UNITED STATE DOLLER (USD)");
		System.out.println("2. PAKISTANI RUPEES (PKR)");
		System.out.println("3. EUROPIEN EURO (EUR)");
		System.out.println("4. RUSSIAN RUBLE (RUB)");
		System.out.println("5. JAPANESE YEN (JPY)");
		System.out.println("6. KRW");
		System.out.print("\n SELECT OPTION: ");
		int opt = sc.nextInt();

		System.out.println("-----------------------------------------------------------");
		if (opt == 1){
			System.out.println("\n1 USD = 87.150137 INR\n");
			float conversion = inrCurr/87.150137f;
			System.out.println(inrCurr + " INR = " + conversion + " USD");
		}
		else if (opt == 2){
			System.out.println("1 PKR = 0.31155974 INR\n");
			float conversion = inrCurr/0.31155974f;
			System.out.println(inrCurr + " INR = " + conversion + " PKR");
		}
		else if (opt == 3){
			System.out.println("1 EUR = 89.090351 INR\n");
			float conversion = inrCurr/89.090351f;
			System.out.println(inrCurr + " INR = " + conversion + " EUR");
		}
		else if (opt == 4){
			System.out.println("1 RUB = 0.87263768 INR\n");
			float conversion = inrCurr/0.87263768f;
			System.out.println(inrCurr + " INR = " + conversion + " RUB");
		}
		else if (opt == 5){
			System.out.println("1 JPY = 0.56017581 INR");
			float conversion = inrCurr/0.56017581f;
			System.out.println(inrCurr + " INR = " + conversion + " JPY");
		}
		else if (opt == 6){
			System.out.println("1 KRW = 0.059413304 INR\n");
			float conversion = inrCurr/0.059413304f;
			System.out.println(inrCurr + " INR = " + conversion + " KRW");
		}
		else{
			System.out.println("INVALID OPTION! PLEASE TRY AGAIN!");
		}
		System.out.println("\n--------------------------> Thank You! <--------------------------");
	}
}
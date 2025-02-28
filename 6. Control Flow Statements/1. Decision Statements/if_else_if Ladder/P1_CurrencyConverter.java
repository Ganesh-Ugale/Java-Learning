/* 
 * Currency Converter Program using if elseif Ladder Statements
*/

import java.util.Scanner;

class CurrencyConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("--------------------- CURRENCY CONVERTER ---------------------");
		System.out.println();
		System.out.println("Enter the Amount(INR) : ");
		float inr = sc.nextFloat();
		System.out.println();
		System.out.println("List of Currency");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println();
		System.out.println("Enter the Currency : ");
		String curr = sc.next().toUpperCase();
		System.out.println();
		
		float currCon;

		if(curr.equals("USD") ){
			currCon = inr/86.56f;
			System.out.println(inr +" INR = " + currCon + " USD");
		}
		else if(curr.equals("EUR")){
			currCon = inr/90.25f;
			System.out.println(inr +" INR = " + currCon + " EUR");
		}
		else if(curr.equals("GBP")){
			currCon = inr/107.66f;
			System.out.println(inr +" INR = " + currCon + " GBP");
		}
		else if(curr.equals("PKR")){
			currCon = inr/0.31f;
			System.out.println(inr +" INR = " + currCon + " PKR");
		}
		else{
			System.out.println("INVALID OPTION!");
		}

	} 
}
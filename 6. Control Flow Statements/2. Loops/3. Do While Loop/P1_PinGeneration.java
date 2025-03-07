/*
To write a program for PIN verification with if wrong pin entered wait for some sec.
*/

import java.util.Scanner;
class PinGeneration
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);

		int storedPin = 123; // Original PIN is stored.
		int seconds = 5000; // 5000 mili sec means 5 sec
		
		outerLoop: // Labled loop
		for (  ;  ;  ) // infinite Loop ask to user again and again for PIN
		{
			int attempts = 3; // declared inside the for loop block bcz after the each 3 attempts reset the attepts var.
			do
			{
				System.out.print("Enter the Pin : ");
				int userPin = sc.nextInt();

				if (userPin == storedPin){ // Matching wish the user and Stored PIN
					System.out.println("PHONE UNLOCKED!");
					break outerLoop; // if PIN match then loop breaks the main for loop using lable name.
				}
				else{ // else PIN is Wrong so ask again with attempts left
					System.out.println("WRONG PIN");
					System.out.println("Attempts Left " + (attempts - 1)); // 2
				}
				attempts--; // Loop updates.
			}
			while (attempts>=1);

			System.out.println();
			System.out.println("WAIT FOR " + (seconds/1000) + " seconds");
			Thread.sleep(seconds);
			seconds *= 2;
			System.out.println(); 
		}
	}
}
/*
Write an Program for Free Books on each doson Using Simple if
 */

import java.util.Scanner;

class NotebookFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books purchased: ");
        int book = sc.nextInt();
		int freeBooks = 0;

		if(book>=12)
		{
			freeBooks = (book >= 12) ? (book / 12) * 2 : 0;
			System.out.println("You purchased " + book + " books.");
			System.out.println("You get " + freeBooks + " free books!");
		}

		System.out.println("Total Books : " + (book + freeBooks));

    }
}

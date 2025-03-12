/*
Print the Following Pattern: (Opposite- Right angle Traingle- Left Side)

* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/


class P22_Pattern{
	public static void main(String[] args) {
		int n = 7; // number of i and j
		for (int i = n; i >= 1; i--) {  // i (rows)
			// for (int j = 1; j <= (n-i); j++) // Space Loop
			// 	System.out.print("  ");
			for (int j = 1; j <= i; j++) // j (columns)
				System.out.print("* "); // Prints the stars + space
			System.out.println();  // Print new Line
		}
	}
}
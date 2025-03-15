/*
Print the following Pattern: (Square + * in Odd Positions)

* * * * * * * * * * * * *
*                       *
*   *   *   *   *   *   *
*                       *
*   *   *   *   *   *   *
*                       *
*   *   *   *   *   *   *
*                       *
*   *   *   *   *   *   *
*                       *
*   *   *   *   *   *   *
*                       *
* * * * * * * * * * * * *

*/

class P41_Pattern{
	public static void main(String[] args) {
		int n = 13;
		for (int i = 1; i <= n; i++) { // Columns (i)
			// for (int space = 1; space <= (n-i); space++) // Space Loop
			// 	System.out.print(" ");
			for (int j = 1; j <= n; j++) // Rows (j)
				if (i==1 || j==1 || i==n || j==n || (j%2 !=0 && i%2 != 0)) 
					System.out.print("* "); // if anyone conditions true then only print star
				else
					System.out.print("  "); // if anyone conditions false then only print space
			System.out.println();  // newline
		}
	}
}
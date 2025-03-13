/*
Print the following Pattern: (LHS- Hollow Right angle Traingle)

*
* *
*   *
*     *
*       *
*         *
* * * * * * *

*/

class P27_Pattern{
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) { // Columns (i)
			// for (int space = 1; space <= (n-i); space++) // Space Loop
			// 	System.out.print("  ");
			for (int j = 1; j <= i; j++) // Rows (j)
				if (j==1 || i==n || i==j) 
					System.out.print("* "); // if anyone conditions true then only print star
				else
					System.out.print("  "); // if anyone conditions false then only print space
			System.out.println();  // newline
		}
	}
}
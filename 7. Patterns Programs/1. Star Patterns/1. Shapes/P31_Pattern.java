/*
Print the following Pattern: (Traingle- Rotate Anti-Clock wise Once)

            *
          * *
        * * *
      * * * *
    * * * * *
  * * * * * *
* * * * * * *
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *

*/

class P31_Pattern{
	public static void main(String[] args) {
		int n = 7;
		for (int i = 1; i <= n; i++) { // Columns (i)
			for (int space = 1; space <= (n-i); space++) // Space Loop
				System.out.print("  ");
			for (int j = 1; j <= i; j++) // Rows (j)
				System.out.print("* ");
			System.out.println();  // newline
		}
		// Down side
		for (int i = (n-1); i >= 1; i--) { // Columns (i)
			for (int space = 1; space <= (n-i); space++) // Space Loop
				System.out.print("  ");
			for (int j = 1; j <= i; j++) // Rows (j)
				System.out.print("* ");
			System.out.println();  // newline
		}
	}
}
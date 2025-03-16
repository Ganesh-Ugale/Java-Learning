/*
Print the following Pattern: (Square + inside 2 sub-sqare)

* * * * * * * * * * * * *
*                       *
*   * * * * * * * * *   *
*   *               *   *
*   *   * * * * *   *   *
*   *   *       *   *   *
*   *   *       *   *   *
*   *   *       *   *   *
*   *   * * * * *   *   *
*   *               *   *
*   * * * * * * * * *   *
*                       *
* * * * * * * * * * * * *

*/

class P43_Pattern{
	public static void main(String[] args) {
		int n = 13;
		for (int i = 1; i <= n; i++) { // Columns (i)
			// for (int space = 1; space <= (n-i); space++) // Space Loop
			// 	System.out.print(" ");
			for (int j = 1; j <= n; j++) // Rows (j)
				if (i==1 || j==1 || i==n || j==n || (i==n/4 && (j>=n/4 && j<=n/2+n/3+1)) || (i==n/2+n/3+1 && (j>=n/4 && j<=n/2+n/3+1)) || (j==n/4 && (i>=n/4 && i<=n/2+n/3+1)) || (j==n/2+n/3+1 && (i>=n/4 && i<=n/2+n/3+1)) || (i==n/8+n/4+1 && (j>=n/8+n/4+1 && j<=n/2+n/4)) || (i==n/2+n/4 && (j>=n/8+n/4+1 && j<=n/2+n/4)) || (j==n/8+n/4+1 && (i>=n/8+n/4+1 && i<=n/2+n/4)) || (j==n/2+n/4 && (i>=n/8+n/4+1 && i<=n/2+n/4))) 
					System.out.print("* "); // if anyone conditions true then only print star
				else
					System.out.print("  "); // if anyone conditions false then only print space
			System.out.println();  // newline
		}
	}
}
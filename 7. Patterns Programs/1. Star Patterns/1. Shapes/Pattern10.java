/*
Print the Following Pattern: (Hollow Square + left Diagonal + right Diagonal + Top-Mid Star)

* * * * * * * * * * * * *
* *                   * *
*   *       *       *   *
*     *           *     *
*       *       *       *
*         *   *         *
*           *           *
*         *   *         *
*       *       *       *
*     *           *     *
*   *               *   *
* *                   * *
* * * * * * * * * * * * *

*/

class Pattern10{
	public static void main(String[] args) {
		int n = 13; // number of i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= n; j++) { // j (columns)
				if (i==1 || j==1 || i==n || j==n || i==j || i+j==n+1 || (i==n/4 && j-1==n/2))
					System.out.print("* ");  // Print stars where i == 1
				else
					System.out.print("  "); // where above condition false so print space
			}
			System.out.println();  // Print new Line
		}
	}
}
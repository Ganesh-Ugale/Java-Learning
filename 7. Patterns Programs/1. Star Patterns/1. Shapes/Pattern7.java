/*
Print the Following Pattern: (Top + Left + Bottom + Right Line of Square i.e Hollow Square)

* * * * *
*		*
*		*
*		*
* * * * *

*/

class Pattern7{
	public static void main(String[] args) {
		int n = 5; // number of i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= n; j++) { // j (columns)
				if (i==1 || j==1 || i == n || j == n) 
					System.out.print("* ");  // Print stars where i == 1
				else
					System.out.print("  "); // where above condition false so print space
			}
			System.out.println();  // Print new Line
		}
	}
}
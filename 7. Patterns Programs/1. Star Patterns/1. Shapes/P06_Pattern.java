/*
Print the Following Pattern: (Top + Left + Bottom Line of Square)

* * * * *
*
*
*
* * * * *

*/

class P6_Pattern{
	public static void main(String[] args) {
		int n = 5; // number of i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= n; j++) { // j (columns)
				if (i==1 || j==1 || i == n) 
					System.out.print("* ");  // Print stars where i == 1
			}
			System.out.println();  // Print new Line
		}
	}
}
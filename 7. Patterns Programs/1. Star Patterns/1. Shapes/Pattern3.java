/*
Print the Following Pattern: (Horizontal Rectangle)

* * * * *
* * * * *
* * * * *
* * * * * 

*/

class Pattern3{
	public static void main(String[] args) {
		int n = 5; // number of i and j
		for (int i = 1; i <= (n-1); i++) {  // i (rows)
			for (int j = 1; j <= n; j++)  // j (columns)
				System.out.print("* "); // Prints the stars + space
			System.out.println();  // Print new Line
		}
	}
}
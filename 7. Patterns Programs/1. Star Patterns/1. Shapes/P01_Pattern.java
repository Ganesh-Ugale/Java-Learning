/*
Print the Following Pattern: (Square)

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

class P1_Pattern{
	public static void main(String[] args) {
		int n = 5; // number i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= n; j++)  // j (columns)
				System.out.print("* "); // Prints the stars + space
			System.out.println();  // gives new Line after every iteration. i.e cursor sets after each complete j iteration to new line.
		}
	}
}
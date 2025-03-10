/*
Print the Following Pattern: (verticle Rectangle)

* * * * 
* * * * 
* * * * 
* * * * 
* * * * 

*/

class P2_Pattern{
	public static void main(String[] args) {
		int n = 5; // number of i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= (n-1); j++)  // j (columns)
				System.out.print("* "); // Prints the stars + space
			System.out.println();  // Print new Line
		}
	}
}
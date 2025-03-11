/*
Print the Following Pattern: (left side Parallelogram)

* * * * * * * * * *
 * * * * * * * * * *
  * * * * * * * * * *
   * * * * * * * * * *
    * * * * * * * * * *
     * * * * * * * * * *
      * * * * * * * * * *
       * * * * * * * * * *
        * * * * * * * * * *
         * * * * * * * * * *
*/

class P15_Pattern{
	public static void main(String[] args) {
		int n = 10; // number of i and j
		for (int i = 10; i >= 1; i--) {  // i (rows)
			for (int j = 1; j <= (n-i); j++) // Space Loop
				System.out.print(" ");
			for (int j = 1; j <= n; j++) // j (columns)
				System.out.print("* "); // Prints the stars + space
			System.out.println();  // Print new Line
		}
	}
}
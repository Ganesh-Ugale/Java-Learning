/*
Print the Following Pattern: (Hollow - right side Parallelogram + Mid-dot)

            * * * * * * * * * * * * *
           *                       *
          *                       *
         *                       *
        *                       *
       *                       *
      *           *           *
     *                       *
    *                       *
   *                       *
  *                       *
 *                       *
* * * * * * * * * * * * *

*/

class P18_Pattern{
	public static void main(String[] args) {
		int n = 13; // number of i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= (n-i); j++) // Space Loop
				System.out.print(" ");
			for (int j = 1; j <= n; j++) // j (columns)
				if (i==1 || j==1 || i==n || j==n || (j==n/2+1 && i==n/2+1)) // Prints the stars + space
					System.out.print("* ");
				else  // where the if condition is false then print the 2 spaces
					System.out.print("  ");
			System.out.println();  // Print new Line
		}
	}
}
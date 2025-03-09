/*
Print the Following Pattern: (ixj Matterix)

1:1 1:2 1:3 1:4 1:5
2:1 2:2 2:3 2:4 2:5
3:1 3:2 3:3 3:4 3:5
4:1 4:2 4:3 4:4 4:5
5:1 5:2 5:3 5:4 5:5

*/

class Pattern0{
	public static void main(String[] args) {
		int n = 5; // number of i and j
		for (int i = 1; i <= n; i++) {  // i (rows)
			for (int j = 1; j <= n; j++) // j (columns)
				System.out.print(i + ":" + j + " "); // Prints the stars + space
			System.out.println();  // Print new Line
		}
	}
}
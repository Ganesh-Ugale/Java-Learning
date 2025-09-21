package javaMockTest1;

public class NumberPattern1 {
	
	public static void main(String[] args) {
		
		int n = 15, k = 1;
		
		for (int i = 1; k <= n; i++) {
			for (int j = i+k-1; j>=k; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			k+=i;
		}
	}
}

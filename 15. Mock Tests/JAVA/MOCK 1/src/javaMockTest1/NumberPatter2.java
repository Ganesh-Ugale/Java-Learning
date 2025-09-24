package javaMockTest1;

public class NumberPatter2 {
	public static void main(String[] args) {
		
		int n = 5, num = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				
				int din = 2;
				while (num > din) {
					if ((num % din == 0)) {
						num++;
						din = 1;
					}
					din++;
				}
				
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}
}

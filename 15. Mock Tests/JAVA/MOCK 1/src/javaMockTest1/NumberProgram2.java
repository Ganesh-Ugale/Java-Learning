package javaMockTest1;

public class NumberProgram2 {
	public static void main(String[] args) {
		
		int num = 123456;
		
//		Length
		int len = 0;
		for (int i = num; i > 0; i/=10) {
			len++;
		}
		
//		Divisor
		int div = 1;
		for (int i = 0; i < len/2; i++) {
			div *= 10;
		}
		
		
//		Add Reverse num into New Number
		int newNum = num/div;
		int cnt = 0;
		for (int i = num; i > 0; i/=10) {
			
			int rem = i % 10;
			newNum = (newNum * 10) + rem;
			
			if (++cnt == len/2) {
				break;
			}
		}
		
		System.out.println(newNum);
	}
}

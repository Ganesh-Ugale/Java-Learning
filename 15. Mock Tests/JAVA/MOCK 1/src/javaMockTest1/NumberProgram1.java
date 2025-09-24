package javaMockTest1;

public class NumberProgram1 {
	public static void main(String[] args) {
		
		 int num = 15;
		 
//		 nPrime
		 int din = 2, nPrime = num+1;
		 while (nPrime > din) {
			if (nPrime % din == 0) {
				nPrime++;
				din = 1;
			}
			din++;
		}
		 
//		 pPrime
		 din = 2;
		 int pPrime = num-1;
		 while (pPrime > din) {
			if (pPrime % din == 0) {
				pPrime--;
				din = 1;
			}
			din++;
		}
		 
//		 Print
		 if (num-pPrime < nPrime-num) {
			System.out.println(pPrime+" : "+num+"  ");
		}
		else if (num-pPrime > nPrime-num) {
			System.out.println("  "+num+" : "+nPrime);
		}
		else {
			System.out.println(pPrime+" : "+num+" : "+nPrime);
		}
	}
}	

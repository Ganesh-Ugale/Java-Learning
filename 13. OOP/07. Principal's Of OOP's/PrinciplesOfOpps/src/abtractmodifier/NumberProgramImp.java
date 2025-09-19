package abtractmodifier;

// This is an Service Provider class

public class NumberProgramImp extends NumberPrograms{

//	Designing a methods
	
//	isPrime Method
	public boolean isPrime(int num) {
		int din = 2;
		while (din < num) {
			if(num % din == 0) {
				return false;
			}
			din++;
		}
		return din == num;
	}
	
//	Factorial Methods
	public int factorial(int num) {
		int fact = 1;
		for(int i = num; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}
	
//	Power Method
	public float pow(float base, float raise) {
		float pow = 1;
		for(int i = 1; i <= raise; i++) {
			pow *= base;
		}
		return pow;
	}
	
	
}

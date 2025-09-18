package abtractmodifier;

// Service User Class

public class CalculatorDriver {
	public static void main(String[] args) {
		
		Calculator c1 = new CalculatorImp(); // Up casting
		
		System.out.println(c1.addition(5, 4));
		System.out.println(c1.subtraction(10, 5));
		System.out.println(c1.multiplication(5, 2));
		System.out.println(c1.division(10, 2));
		
		System.out.println(c1.modulo(20, 2));
		
		System.out.println(c1.brand); // NS var
		
//		c1.hello(); // static method
//		Calculator.hello(); // static method
		
	}
}

package abtractmodifier;

// Abstraction

public abstract class Calculator {
	String brand = "Casio";
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
//	Here We Design a Abstract Methods
	public abstract int addition(int n1, int n2);
	public abstract int subtraction(int n1, int n2);
	public abstract float multiplication(float n1, float n2);
	public abstract float division(float n1, float n2);
	
//	Here We Design one Concrete Method
	public String modulo(float n1, float n2) {
		return  "Modulo is: " + n1 % n2;
	}
	
	public static void hello() {
		System.out.println("Static part");
	}
}

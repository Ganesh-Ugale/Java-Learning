package abtractmodifier;

/*If we inherits the abstract class then we need to make the this class also
  abstract, OR need to give implementation Details to that methods i.e Override. 
*/

public class CalculatorImp extends Calculator {
	
	public CalculatorImp() {
		// TODO Auto-generated constructor stub
	}
	
//	Overrides the all Methods from parent class i.e we gives the new Design to parent class methods
	public int addition(int num1, int num2) {
		return num1 + num2;
	}      
	
	public int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	public float multiplication(float num1, float num2) {
		return num1 * num2;
	}
	
	public float division(float num1, float num2) {
		return num1 / num2;
	}
	
//	Extra Feature we design that are not present in the Parent class
	public void name() {
		System.err.println("Hello");
	}
	
}

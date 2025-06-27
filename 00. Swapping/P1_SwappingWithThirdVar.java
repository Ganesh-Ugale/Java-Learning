/**
 * Swapping Values with Third Variable
 */

class SwappingWithThirdVar
{
	public static void main(String[] args)
	{
		// Swapping values with Third Variable

		int a = 2;
		int b = 4;
		int temp; // 3rd var

		System.err.println("BEFORE SWAPPING a: " + a);
		System.err.println("BEFORE SWAPPING b: " + b);

		temp = a;
		a = b;
		b = temp;

		System.err.println("AFTER SWAPPING a: " + a);
		System.err.println("AFTER SWAPPING b: " + b);

		
	}
}
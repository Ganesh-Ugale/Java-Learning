/**
 * Swapping Values Withoud Using Third Variable
 */

class SwappingWithoutThirdVar
{
	public static void main(String[] args)
	{
		// Swapping Without Third Var

		int a = 2;
		int b = 4;

		System.out.println("BEFORE SWAPPING a: " + a);
		System.out.println("BEFORE SWAPPING b: " + b);

		a = a+b; // 6
		b = a-b; // 2
		a = a-b; // 4

		System.out.println("AFTER SWAPPING a: " + a);
		System.out.println("AFTER SWAPPING b: " + b);

	}
}
// Float Conversion means Storing a Value from smaller container to bigger container i.e Widening

class FloatConversion
{
	public static void main(String[] args)
	{
		// float value is not stored in byte, char, short, long, int bcz these are smaller than float

		float floatValue = 100l; // OR Float.MAX_VALUE
		System.out.println("float Max Value: " + floatValue);

		double doubleVar = floatValue; // Stored Successfully
		System.out.println("float to double: " + doubleVar);
	}
}
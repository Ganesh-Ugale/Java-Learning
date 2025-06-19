// Short Conversion means Storing a Value from smaller container to bigger container i.e Widening


class ShortConversion
{
	public static void main(String[] args)
	{
		// Short Value is can't Store to Byte Date Type Var 

		short shortValue = 32767; // Stored Successfully
		System.out.println("Short Max Value: " + shortValue);

		char charVar = (char)shortValue; // CTE lossy conversion from short to char
		System.out.println("Short to char: " + charVar);

		int intVar = shortValue; // Stored Successfully
		System.out.println("short to int: " + intVar);

		long longVar = shortValue; // Stored Successfully
		System.out.println("short to long: " + longVar);

		float floatVar = shortValue; // Stored Successfully
		System.out.println("short to float: " + floatVar);
		
		double doubleVar = shortValue; // Stored Successfully
		System.out.println("short to double: " + doubleVar);



	}
}
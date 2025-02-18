// Char Conversion means Storing a Value from smaller container to bigger container i.e Widening


class CharConversion
{
	public static void main(String[] args)
	{
		// char value is not able to store in byte and short bcz these are a smaller
		char charValue = '1'; // or Assign any char
		System.out.println("Char Value: " + charValue);

		int intVar = charValue; // Stored Successfully
		System.out.println("char to int: " + intVar);

		long longVar = charValue; // Stored Successfully
		System.out.println("char to long: " + longVar);

		float floatVar = charValue; // Stored Successfully
		System.out.println("char to float: " + floatVar);

		double doubleVar = charValue; // Stored Successfully
		System.out.println("char to double: " + doubleVar);
	}
}
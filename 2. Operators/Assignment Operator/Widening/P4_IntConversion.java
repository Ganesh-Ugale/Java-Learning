// Int Conversion means Storing a Value from smaller container to bigger container i.e Widening

class IntConversion
{
	public static void main(String[] args)
	{
		// Byte and Short can't Store the int type data bcz thoes are smaller than int

		int intValue = 2147483647;
		System.out.println("Int Max Value: " + intValue);

		//char charVal = intValue; // lossy conversion from int to char
		//System.out.println("Int to Char: " + charValue);

		long longVar = intValue; // Stored Successfully
		System.out.println("int to long: " + longVar);

		float floatVar = intValue; // Stored Successfully
		System.out.println("int to float: " + floatVar);

		double doubleVar = intValue; // Stored Successfully
		System.out.println("int to double: " + doubleVar);

	}
}
// Byte Conversion means Storing a Value from smaller container to bigger container .i.e Widening

class ByteConversion
{
	public static void main(String[] args)
	{
		byte byteValue = 127;
		System.out.println("Byte Max Value: " + byteValue);

		short shortVar = byteValue; // Stored Succesfully
		System.out.println("byte to short: " + shortVar);

		char charVar = (char)byteValue; // CTE lossy conversion from byte to char
		System.out.println("Byte to char: " + charVar);

		int intVar = byteValue; // Stored Succesfully
		System.out.println("byte to int: " + intVar);

		long longVar = byteValue; // Stored Succesfully
		System.out.println("byte to long: " + longVar);

		float floatVar = byteValue; // Stored Succesfully
		System.out.println("byte to float: " + floatVar);

		double doubleVar = byteValue; // Stored Succesfully
		System.out.println("byte to double: " + doubleVar);

	}
}
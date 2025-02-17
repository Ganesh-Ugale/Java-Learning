class FloatConversion
{
	public static void main(String[] args)
	{
		// Larger data is Converted in Smaller Type by TypeCasting

		float floatValue = 100f;
		System.out.println("Float Value: " + floatValue);

		long longVar = (long)floatValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("float to long: " + longVar);

		int intVar = (int)floatValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("float to int: " + intVar);

		char charVar = (char)floatValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("float to char: " + charVar);

		short shortVar = (short)floatValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("float to short: " + shortVar);

		byte byteVar = (byte)floatValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("float to byte: " + byteVar);
	}
}
class DoubleConversion
{
	public static void main(String[] args)
	{
		// Larger data is Converted in Smaller Type by using TypeCasting i.e Narrowing is done explicitly 

		double doubleValue= 750.75123456789d;
		System.out.println("Double Value is: " + doubleValue);

		float floatVar = (float)doubleValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("double to float: " + floatVar);

		long longVar = (long)doubleValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("double to long: " + longVar);

		int intVar = (int)doubleValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("double to int: " + intVar);

		char charVar = (char)doubleValue; // Stored using TYPECAST OPERATOR but O/P is ? bcz the cmd supports only ASCII char by default from 0 to 127
		System.out.println("double to char: " + charVar); 

		short shortVar = (short)doubleValue; // Stored Successfully using TYPECAST OPERATOR
		System.err.println("double to short: " + shortVar); 

		byte byteVar = (byte)doubleValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("double to byte: " + byteVar);// but Exceeds the range o/p comes but different

	}
}
class CharConversion
{
	public static void main(String[] args)
	{
		// Larger data is Converted in Smaller Type by TypeCasting

		char charValue = 'G'; // OR any number without single inverted commas
		System.out.println("Char Value is: " + charValue);

		short shortVar = (short)charValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("Char to short: " + shortVar);

		byte byteVar = (byte)charValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("Char to byte: " + byteVar);
	}
}
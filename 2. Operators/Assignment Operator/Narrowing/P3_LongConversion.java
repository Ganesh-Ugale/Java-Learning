class LongConversion
{
	public static void main(String[] args)
	{
		// Larger data is Converted in Smaller Type by TypeCasting

		long longValue = 89991695l; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("Long Value is: " +  longValue);

		int intVar = (int)longValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("long to int: " + intVar);

		char charVar = (char)longValue; // Stored Successfully but the range is exceeds
		System.out.println("long to char: " + charVar);

		short shortVar = (short)longValue; // // Stored using TYPECAST OPERATOR but the int range is exceeds and output comes different
		System.out.println("long to short: " + shortVar);

		byte byteVar = (byte)longValue; // Stored Successfully TYPECAST OPERATOR but the range is exceeds
		System.out.println("long to byte: " + byteVar);
	}
}
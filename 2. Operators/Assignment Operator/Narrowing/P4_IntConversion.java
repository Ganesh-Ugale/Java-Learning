class IntConversion
{
	public static void main(String[] args)
	{
		// Larger data is Converted in Smaller Type by TypeCasting

		int intValue = 122;
		System.out.println("Int Value is: " + intValue);

		char charVar = (char)intValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("int to char: " + charVar);

		short shortVar = (short)intValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("int to short: " + shortVar);

		byte byteVar= (byte)intValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("int to byte: " + byteVar);
	}
}
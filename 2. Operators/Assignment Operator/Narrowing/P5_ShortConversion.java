class ShortConversion
{
	public static void main(String[] args)
	{
		// Larger data is Converted in Smaller Type by TypeCasting

		short shortValue = 127;
		System.out.println("short Value is: " + shortValue);

		byte byteVar = (byte)shortValue; // Stored Successfully using TYPECAST OPERATOR
		System.out.println("short to byte: " + byteVar);

	}
}
// Long Conversion means Storing a Value from smaller container to bigger container i.e Widening


class LongConversion
{
	public static void main(String[] args)
	{
		// long value is not able to store in byte, short, char, int bcz these are smaller data types as compared to long

		long longValue = 9223372036854775807L;
		System.out.println("Long Max Value: " + longValue);

		float floatVar = longValue; // Stored Successfully
		System.out.println("long to float: " + floatVar);

		double doubleVar = longValue; // Stored Successfully
		System.out.println("long to double: " + doubleVar);


	}
}
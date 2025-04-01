/*
To Print the Default Values of Static variable declared in the class block as Following:
*/

class P03_StaticVarDefaultValuesPrint{
	// Static Variables
	static byte byteVar;
	static short shortVar;
	static char charVar;
	static int intVar;
	static long longVar;
	static float floatVar;
	static double doubleVar;
	static boolean booleanVar;
	static String stringVar;    

	public static void main(String[] args) {
		System.out.println("byteVar : " + byteVar);
		System.out.println("shortVar : " + shortVar);
		System.out.println("charVar : " + charVar);  // char value prints blank bcz it's default value is \u0000.
		System.out.println("intVar : " + intVar);
		System.out.println("longVar : " + longVar);
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
		System.out.println("booleanVar : " + booleanVar);
		System.out.println("StringVar : " + stringVar);
	}
}
/*
 * Addition on Different Data Types, Learning How Java Prompts Data into int and Double automatically OR How to convert one type of data into another type automatically. */

class Addition
{
	public static void main(String[] args)
	{
		// byte + byte
		byte var1 = (100);
		byte var2 = (var1);
		int result1= var1 + var2;
		System.out.println("byte+byte=int: " + result1);

		// short + short
		short var3 = 200;
		short var4 = 500;
		int result2 = var3 + var4;
		System.out.println("short+short=int: " + result2);

		// char + char
		char var5 = 'A'; //65
		char var6 = 'B'; //66
		int result3 = var5 + var6;
		System.out.println("char+char=int: " + result3);

		// int + int
		int var7 = 2147483647; // if here store 2147483647
		int var8 = 1000; // if here store 2147483647
		int result4 = var7 + var8; // according to above O/P is -2 bcz java assumes the result is in int only 
		System.out.println("int+int=int: " + result4);

		// long + long
		long var9 = 123456789l; // if here store 9223372036854775807l
		long var10 = 123456789l; // if here store 9223372036854775807l
		long result5 = var9 + var10; // according to above condition O/P is -2 bcz exceeds the range of float
		System.out.println("long+long=long: " + result5);

		// float + float
		float var11 = 506010.26f;
		float var12 = 8945623.25f;
		float result6 = var11 + var12;
		System.out.println("float+float=float: " + result6);

		// double + double
		double var13 = 1.1;
		double var14 = 1.26;
		double result7 = var13 + var14;
		System.out.println("double+double=double: " + result7);

		// String + String
		String var15 = "Hello";
		String var16 = "Java";
		String result8 = var15 + var16; // String Concatination is Done Here
		System.out.println("String+String=String: " + result8);

		// boolean + boolean
		boolean a = true;
		boolean b = false;
		//boolean c = a + b;
		//System.out.println("boolean+boolean=CTE: " + c);




	}
}
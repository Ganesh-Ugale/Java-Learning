/*
 * Substraction on Different Data Types, Learning How Java Prompts Data into int and Double automatically OR How to convert one type of data into another type automatically. */


class Subtraction
{
	public static void main(String[] args)
	{
		// byte - byte
		byte var1 = 127;
		byte var2 = 120;
		int result1= var1 - var2;
		System.out.println("byte-byte=int: " + result1);

		// short - short
		short var3 = 200;
		short var4 = 500;
		int result2 = var3 - var4;
		System.out.println("short-short=int: " + result2);

		// char - char
		char var5 = 'A'; // We can also put \u0000 i.e lowest value unicode char
		char var6 = 'B'; //we can also put here \uFFFF i.e Highest Value of unicode char
		int result3 = var5 - var6;
		System.out.println("char-char=int: " + result3);

		// int - int
		int var7 = 500; // if here store 2147483647
		int var8 = 300; // if here store 2147483646
		int result4 = var7 - var8; // O/P is 1 bcz in Subtraction there is no way to exceeds the range.
		System.out.println("int-int=int: " + result4);

		// long - long
		long var9 = 5000; // if here store 9223372036854775807l
		long var10 = 25000; // if here store 9223372036854775806l
		long result5 = var9 - var10; // O/P is 1
		System.out.println("long-long=long: " + result5);

		// float - float
		float var11 = 2.5f;
		float var12 = 3.5f;
		float result6 = var11 - var12;
		System.out.println("float-float=float: " + result6);

		// double - double
		double var13 = 2.5;
		double var14 = 2.0;
		double result7 = var13 - var14;
		System.out.println("double-double=double: " + result7);

		// String - String
		//String var15 = "Hello";
		//String var16 = "Java";
		//String result8 = var15 - var16; // CTE
		//System.out.println("String-String=String: " + result8);

		// boolean + boolean
		//boolean a = true;
		//boolean b = false;
		//boolean c = a + b;
		//System.out.println("boolean+boolean=CTE: " + c);


		char chch = '\uFFFF';
		System.out.println((int)chch); // 65535 this is the highest value of char we called it as a BMP size

	}
}
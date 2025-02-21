class Practice1
{
	public static void main(String[] args)
	{
		//1
		int a = 5;
		int b = 7;

		int c = a++ + b;

		System.out.println("1. a = " + a + " b = " + b + " c = " + c);

		//2
		int A = 5;
		int B = 7;
		int C = ++ A + B;
		System.out.println("2. A = " + A + " B = " + B + " C = " + C);

		//3
		int m = 1, n = 2;
		int o = m++ + n + ++m;
		System.out.println("3. m = " + m + " n = " + n + " o = " + o);

		//4
		a = 10;
		b = ++a;
		System.out.println("4. a = " + a + " b = " + b);
		//b = 10++; // gives an error  bcz only variable is allowed
		System.out.println("5. a = " + a + " b = " + b);
	}
}
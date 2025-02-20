class MeidumLevel
{
	public static void main(String[] args)
	{
		// Medium Level
		//1
		int a = 5, b = 10;
		int c = ++a + b-- + a-- - b;
		System.out.println("1. a = " + a + ", b = " + b + ", c = " + c);

		//2
		int x = 7;
		int y = x++ - --x + ++x + x--;
		System.out.println("2. x = " + x + ", y = " + y);

		//3
		int p = 6;
		int q = p-- + ++p + --p;
		System.out.println("3. p = " + p + ", q = " + q);



	}
}
class EasyLevel
{
	public static void main(String[] args)
	{
		// Easy Level 
		//1
		int a = 5;
		int b = 3;
		int c = a++ + b;
		System.out.println("1. a = " + a + ", b = " + b + ", c = " + c);

		//2
		int x = 4;
		int y = x++ + ++x;
		System.out.println("2. x = " + x + ", y = " + y);

		//3
		int p = 7;
		int q = --p + p++;
		System.out.println("3. p = " + p + ", q = " + q);

		//4
		int m = 10;
		int n = m-- + m++ + ++m;
		System.out.println("4. m = " + m + ", n = " + n);

		//5
		x = 3;
		y = 2;
		int z = ++x - --y;
		System.out.println("5. x = " + x + ", y = " + y + ", z = " + z);

		//6
		a = 8;
		b = a-- + a++;
		System.out.println("6. a = " + a + ", b = " + b);

		//7
		int i = 1;
		int j = i++ + ++i;
		System.out.println("7. i = " + i + ", j = " + j);

		//8
		int u = 6, v = 2;
		int w = u-- - ++v;
		System.out.println("8. u = " + u + ", v = " + v + ", w = " + w);

		//9
		p = 4;
		q = 5;
		int r = ++p + --q;
		System.out.println("9. p = " + p + ", q = " + q + ", r = " + r);

		//10
		a = 3;
		b = 4;
		c = --a + b++ - a;
		System.out.println("10. a = " + a + ", b = " + b + ", c = " + c);

	}
}
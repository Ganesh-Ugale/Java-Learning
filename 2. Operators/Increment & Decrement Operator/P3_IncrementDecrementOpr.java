class IncrementDecrementOpr
{
	public static void main(String[] args)
	{
		// Increment Operator
		// #Pre-Increment Operator & Post-Increment Operator

		System.out.println("Increment Operator");

		int a = 2;
		System.out.println(++a); // 3
		System.out.println(++a); // 4
		System.out.println(a++); // 4
		System.out.println(++a + a++); // 6 + 6 = 12
		System.out.println(a++);// 7
		System.out.println(++a * ++a);// 9 * 10 = 90
		System.out.println(a++ - a++); // 10 - 11 = -1
		System.out.println(a); // 12

		// Decrement Operator
		// #Pre-Decrement Operator & Post-Decrement Operator
		
		System.out.println("Decrement Operator");

		int b = 10;
		System.out.println(--b); // 9
		System.out.println(b--); // 9
		System.out.println(--b); //7
		System.out.println(--b + --b); // 6 + 5 = 11
		System.out.println(b-- + --b); // 5 + 3 = 8
		System.out.println(b-- - b--); // 3 - 2 = 1
		System.out.println(b--); // 1
		System.out.println(--b); // -1
		System.out.println(b); //-1

	}
}
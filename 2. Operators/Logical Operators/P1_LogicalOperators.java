class LogicalOperators
{
	public static void main(String[] args)
	{
		// Always put the brackets for logical operators if you want to add with string
		System.out.println("true && true: " + (true && true)); // true
		System.out.println("true || true: " + (true || true)); // true
		System.out.println("true && false: " + (true && false)); //false
		System.out.println("(!true) && true: " + ((!true) && true)); //false
		System.out.println("0%2==0 || 1%2==1: " + (0%2==0 || 1%2==1)); //true
		System.out.println("4>6 && false: " + (4>6 && false)); // false
		System.out.println("(!false) || (!true): " + ((!false) || (!true))); // true
		System.out.println("'a'=='A' || false==false: " + ('a' == 'A' || false==false)); // true
		System.out.println("'a'/'b'==0 || '1'==1: " + ('a'/'b'==0 || '1'==1)); // true
	}
}
class RelationalOperator
{
	public static void main(String[] args)
	{
		System.out.println("10>20: " + (10 >20));
		System.out.println("10<20: " + (10 <20));
		System.out.println("0>0.0: " + (0>0.0));
		System.out.println("59.999==60: " + (59.999==60));
		System.out.println("97!=100: " + (97!=100));
		System.out.println("'a'<'A': " + ('a'<'A'));
		System.out.println("z<=122: " + ('z'<=122));
		//System.out.println("false<true: " + (false<true)); // bad operand types for binary operator '<'
		System.out.println("false==true: " + (false==true));
		System.out.println("true!=true: " + (true!=true));
		System.out.println("22/7>=22.0/7.0: " + (22/7>=22.0/7.0));
		System.out.println("22.0/7.0>=22.0f/7.0f: " + (22.0/7.0>22.0f/7.0f));
		System.out.println("(!true && !false) : " + ((!true) && (!false))); // Logical Operator
	}
}
class Practice_StaticModifier_TraceProgram{
	// Static Var & Blocks
	static double d;

	static
	{
		d = test(100);
		System.out.println(d);
		d = test(d) + demo((int)(d));

		double d = demo((int)test(Practice_StaticModifier_TraceProgram.d));

		System.out.println(d);
	}

	// Main Methods
	public static void main(String[] args) {
		System.out.println(d);

		System.out.println(test(d));

		System.out.println((int)demo((int)d));
	}

	// METHODS
	public static double test(double num){
		return num * num;
	}

	public static char demo(int num){
		return ((char)(num));
	}

}
// How Widening is Done in Methods, Who Calling and who Called

class P03_WideningInMethod{
	public static void main(String[] args) {
		sum('a', 10);  // Method Calling
		division(10, 2); // Method Calling
	}

	// Methods Definitions
	public static void sum(int a, int b){  // Method Called and Widening is done
		System.out.println(a+b);
	}
	public static void division(double num, double din){ // Method Called
		System.out.println(num/din);
	}
}
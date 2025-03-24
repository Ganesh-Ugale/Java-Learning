// We Can use same type with same name variables in different blocks

class P3_LocalVarLimitationsInMethods{
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		LocalVariables(); // Calling a Method
	}
	public static void LocalVariables(){  // Method Definition
		int a = 5;
		System.out.println(a);
	}
}
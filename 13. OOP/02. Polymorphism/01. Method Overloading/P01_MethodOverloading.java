/*
1. Method Overloading Process is done during the Compile Time.
2. Having Multiple Method of same name but different in No. of Arguments OR Type
   of Arguments.
3. Ex: Println() Method is Overloaded in 10 times in Java.

*/
class P01_MethodOverloading{
	public static void main(String[] args) {

		// Deside on base of Method Binding Process
		add(5, 5);
		add(5.0, 3.0);
		add(5.0f, 2.0f); 
		add('a', 'b');  // char ' '
		add("a", "b");  // String " "
		add(2, 3, 4); 
		add(2.0, 3.0, 4.0);

		System.out.println("\nMixed Type of Arguments : \n");

		add(2, 5.3);
		add('a', 5);
		add(2, 3.0, 5);
		add(2.0,'a');
		add(2, 'a', 2f); // calling both double method
		add(99f, 22d);  // calling both double method
	}

	// OVERLOADED METHODS

	// Methods Having Same name but different num of arguments OR Type of Arguments.
	public static void add(int num1, int num2){
		System.out.println("int + int: " + (num1 + num2));
	}

	public static void add(float num1, float num2){
		System.out.println("float + float: " + (num1 + num2));
	}

	public static void add(double num1, double num2){
		System.out.println("double + double: " + (num1 + num2));
	}

	public static void add(char ch1, char ch2){
		System.out.println("char + char: " + (ch1 + ch2));
	}

	public static void add(String s1, String s2){
		System.out.println("String + String: " + (s1 + s2));
	}

	public static void add(int num1, int num2, int num3){
		System.out.println("int + int + int: " + (num1 + num2 + num3));
	}

	public static void add(double num1, double num2, double num3){
		System.out.println("double + double + double: " + (num1 + num2 + num3));
	}
}
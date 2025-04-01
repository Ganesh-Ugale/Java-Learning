/*
1. Static var are assign with the default value during the class loading process.
2. static var can be used within a same class directly & also inside the other class
   using class name as a referance.
3. Static var are declared in the class block & prefix with the static modifier is known
   as static var.
*/

class P01_StaticVar{

	static int a; // Declared a Static var " a " inside the class block with default value 0. i.e static members are globally accessible in everywhere.
	static int b = 10;
	public static void main(String[] args) {
		System.out.println("Inside Main Method Value of a : " + a); // a is accesible in the main method block.
	}
	// METHODS
	public static void test(){
		System.out.println(a); // a is accessible to user defined methods/ other methods also with default value 0.
	}
}
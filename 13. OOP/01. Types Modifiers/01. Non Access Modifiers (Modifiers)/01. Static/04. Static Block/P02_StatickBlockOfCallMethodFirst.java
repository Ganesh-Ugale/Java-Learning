/*
We can also call any method inside a static block to execute this block of code before the main method starts.
NOTE: Execution is Done in TOP TO BOTTOM WAY for the static var, block and method Excepts Main Method bcz Main Method Executes at last.
*/

class P02_StatickBlockOfCallMethodFirst{
	// Static Members
	static int a = 10; // static var
	static{ // static block
		System.out.println("\nFrom Static Block 1!");
	}
	static{  // static block
		System.out.println("From Static Block 2!");
		test(); // calling a test() method inside a static block
	}

	// Main Method()
	public static void main(String[] args) {
		System.out.println("\nFrom Main Method!\n");  // Executes at last
	}

	// USER DEFINED METHODS
	public static void test(){ // static method
		System.out.println("From Method Block!");
	}
}
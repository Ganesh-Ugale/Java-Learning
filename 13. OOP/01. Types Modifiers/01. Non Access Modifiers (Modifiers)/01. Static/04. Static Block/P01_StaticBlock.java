/*
1. We Can Executes a Block of Code Before the main method Execution Starts.
i.e it executes during the class loading process. 
2. Such as Variable, methods, or any static member of class.
3. NOTE: We Can Execute a Stack block or any member of class before the main() 
   Method, but, We Can't Run a Program Without Main Method, So Main method is IMP for executing a Program Successfully.
*/

class P01_StaticBlock{
	// Static Block

	// Declare Before the main method Writes
	static{ // there is no any signatur
		System.out.println("\nStatic Block 1 Executed!"); // Executes First bcz Static Members are Executes TOP to BOTTOM Priority Wise.
	}
	
	public static void main(String[] args) {
		System.out.println("\nMain Method Executed!\n");
	}

	// Declare After the main Method Writes
	static{
		System.out.println("Static Block 2 Executed!"); // Executes 2nd
	}
	static{
		System.out.println("Static Block 3 Executed!"); // Executes 3rd
	}
}
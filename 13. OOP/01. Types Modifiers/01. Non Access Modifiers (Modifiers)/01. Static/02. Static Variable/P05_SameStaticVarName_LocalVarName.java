/*
REASONS:-
1. When We have a Static var and Local Var of Same name, then the 1st Priority is gives 
   to the local var. i.e Local Var prints or executes.
2. But if you want to access a Static var so we need to access them using class name as 
   a referance (i.e className.varName).

*/

// Note: in class name or File _ and $ is acceptable only.
// Note: When you want to run the program without compilation so is mandatory the class name & File name must be same.

class P05_SameStaticVarName_LocalVarName{
	static String str = "staticVar";  // static var
	public static void main(String[] args) {

		System.out.println(str); // print's staticVar bcz till now any local var found. so the static var value prints. // O/P: staticVar

		// here the local var having same name with 
		String str = "localVar";  // Local var Found so the 1st priority gives to the local var.
		System.out.println(str); // Print's localVar bcz local var has 1st Priority by default. // O/P: localVar

		// if you want to access static var now, so we access it using class as a referance. so the jvm search it in the class block, instead of method block.
		System.out.println(P05_SameStaticVarName_LocalVarName.str); // O/P: staticVar

		System.out.println(str); // here prints the local var value
	}
}
/*
To Access the Static Var from another class to current class.

Note: When we access a static var form another class then it prints the it's initial value that var has to assigned, the static var has always assigned by default with it's initial value or defualt value. so it print that value but if we already assign some value to the static var so it is it's initial value so it gives that value.
*/

class P04_StaticVarAccessInAnotherClass{
	public static void main(String[] args) {
		// Access balance var Initial Value that assign in P02_StaticVar this class.
		// in the P02_StaticVar class we did not assign any value but it is a static so it has assign it's default value 0.0
		System.out.println("Prints Initial Value of balance: " + P02_StaticVar.balance); // 0.0
		// Access b var Initial Value that assign in P01_StaticVar this class.
		// int the P01_StaticVar class we assign a value 10 to b var so it's initial value is now 10 so it prints here 10.
		System.out.println("Prints Initial Value of b: " + P01_StaticVar.b); // 10
	}
}
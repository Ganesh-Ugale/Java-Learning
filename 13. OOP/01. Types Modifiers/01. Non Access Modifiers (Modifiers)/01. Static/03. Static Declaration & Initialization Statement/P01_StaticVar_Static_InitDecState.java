/*
In Static Var & Static Initiazation and Declaration Statement:

1. Here We see How the Static Initialization and Declaration Statement Works.
2. Static Members are Executes Before the Actual Execution of Main() method starts.
3. The Declaration and Initialization are Done Simultaniously during the Loading Process.

NOTE: We can declare a Staic var after the main method also, no matter bcz these are executes First before tha main method even it's position after the main method.
*/

class P01_StaticVar_Static_InitDecState{
	// Static Variables

	static double pi = 22.0/7.0; // This Static var is Executes First before the main() method starts it's execution.

	public static void main(String[] args) {
		areaOfCircle(5);
		circumferanceOfCircle(5);	
	}

	// METHODS
	public static void areaOfCircle(int radius){
		double res = pi*(radius*radius);  // pi value is accessible here 
		System.out.println("Area of Circle is : " + res);
	}

	public static void circumferanceOfCircle(int radius){
		double res = 2*(pi*radius); // pi value is accessible here 
		System.out.println("Circumferance of Circle : " + res);
	}
}
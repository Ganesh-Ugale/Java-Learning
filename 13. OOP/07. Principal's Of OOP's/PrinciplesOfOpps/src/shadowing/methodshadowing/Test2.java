package shadowing.methodshadowing;

public class Test2 extends Test1 {
	
	String a = "Hi"; // Non-Static Method
	static String b = "Bye"; // static method
	
//	static method
	public static void demo() {
		System.out.println("From static demo of class Test2");
	}
	
//	non-static method
	public void test() {
		System.out.println("From non-static test of class Test2");
	}
}

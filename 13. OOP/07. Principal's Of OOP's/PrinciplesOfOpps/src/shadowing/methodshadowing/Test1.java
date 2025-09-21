package shadowing.methodshadowing;

public class Test1 {
	
	int a = 10; // Non-Static var
	static int b = 100; // static var
	
//	Static Method
	public static void demo() {
		System.out.println("From Static demo of Class Test1");
	}
	
//	Non-static Method
	public void test() {
		System.out.println("From Non-static test of class Test1");
	}
}

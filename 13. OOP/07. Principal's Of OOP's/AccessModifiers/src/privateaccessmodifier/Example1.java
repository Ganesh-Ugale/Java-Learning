package privateaccessmodifier;

public class Example1 { // a class cannot be private
	private static int a = 10;
	private int b = 20;
	static int c = 20;
	
	private static void test1() { // Private static method
		System.out.println("From Static test1");
	}
	
	private void test2() { // private NS method
		System.out.println("From Non-static test2");
	}
	
	private Example1() { // private constructor
		System.out.println("From Private Constructor");
	}
	
	public void getMethod(){ // designed Getter Method
		System.out.println(a);
		test1();
		test2();
	}
//	The Private Members we can only access in same class
	
	public Example1(int b) {
		super();
		this.b = b;
	}

	public static void main(String[] args) {
		
		System.out.println(Example1.a);
		Example1.test1();
		
		Example1 e1 = new Example1();
		
		System.out.println(e1.b);
		e1.test2();
	}
}

// We Can Call One Method in n number of Times

class P2_MethodCallNOffTimes{
	public static void main(String[] args) {
		HelloWorld(); // Method Call 1
		HelloWorld(); // Method Call 2
		HelloWorld(); // Method Call 3 OR upto n times we can call method
	}
	// Methods Definition
	public static void HelloWorld(){
		System.out.println("Hello World Message!");
	}
}
package defaultaccessmodifier;

/*
 * Default Access Modifier
 * */
class ClassA {
	int a = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		System.out.println(b);
	}
	
	ClassA() {
	}
}

package protectedaccessmodifier;

/*Protected Members*/

public class ClassA {
	protected int varA = 10;
	protected static int varB = 20;
	public static double varC = 300;
	
	protected void name() {
		System.out.println("From Protected NS Method");
	}
	
	protected static void age() {
		System.out.println("From Protected Static Method");
	}
	
	protected ClassA() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		System.out.println(varB);
	}
}

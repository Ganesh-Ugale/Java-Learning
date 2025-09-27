package defaultaccessmodifier;

public class ClassB {
	public static void main(String[] args) {
		System.out.println(ClassA.b); // We Can Access default members from another class of same package
	}
}

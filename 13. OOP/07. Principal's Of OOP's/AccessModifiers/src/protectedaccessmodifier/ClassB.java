package protectedaccessmodifier;

public class ClassB {
	public static void main(String[] args) {
		
		
		System.out.println(ClassA.varB);
		ClassA.age();
		
		ClassA a = new ClassA();
		
	    System.out.println(a.varA);
	    a.name();
	}
}

package isARelationship;

// The keyword extends(acquires) the properties and behaviors to child class
public class ChildClassB extends ParentClassA{
	
	int b = 10;
	
	public void displayB() {
		System.out.println(a); // inherits the properties from Parent Class
		System.out.println(b);
	}
	
	public ChildClassB() {
		// TODO Auto-generated constructor stub
	}
}

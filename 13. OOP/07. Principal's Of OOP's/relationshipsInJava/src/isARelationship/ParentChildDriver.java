/*
 * Here Using Inheritance we no need to create the base class object.
 * We can directly Inherit the properties and Behaviors from parent class to child.
 * */

package isARelationship;

public class ParentChildDriver {
	public static void main(String[] args) {
		
		ChildClassB b1 = new ChildClassB(); // Object of Class B Only
		
		b1.displayA();
		System.out.println("-----------------------------------");
		b1.displayB();
	}
}

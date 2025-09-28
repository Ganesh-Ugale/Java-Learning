package testpackage;

// Accessing the Default Members from another package

import defaultaccessmodifier.*;
public class ClassC /*extends ClassA*/{ // we cannot use the parent class in subclass from different package if they are default
	public static void main(String[] args) {
//		System.out.println(ClassA.b); // default members of another package is not accessible
	}
}

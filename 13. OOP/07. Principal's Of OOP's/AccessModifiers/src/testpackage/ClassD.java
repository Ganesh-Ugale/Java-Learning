package testpackage;

/*Accessing the Protected Members
 * protected > default in visibility OR Accessibility
 * */

import protectedaccessmodifier.*;
public class ClassD extends ClassA{
	public static void main(String[] args) {
		System.out.println(ClassA.varC); // accessing public member
		
//		System.out.println(ClassA.varB); // CTE bcz we try to access it without parent child relation 
		System.out.println(ClassA.varB); // here it can accessible bcz we make a ClassA as a Parent of Class B
	}
}

/*
Public Class:

1. When a Java File contains anyone public class then java file name must be 
   public class name.
2. In Java File contains Only one Public Class is allowed.
3. If We want to add multiple classes with public class in java file then we can
   have one public class and other defualt classes.
*/

public class P01_PublicClass_A{
	public static void main(String[] args) {
		System.out.println("From Public Class A!");
	}
}

class Class_B{
	public static void main(String[] args) {
		System.out.println("From Class B!");
	}
}

class Class_C{
	public static void main(String[] args) {
		System.out.println("From Class C!");
	}
}

class Class_D{
	public static void main(String[] args) {
		System.out.println("From Class D!");
	}
}
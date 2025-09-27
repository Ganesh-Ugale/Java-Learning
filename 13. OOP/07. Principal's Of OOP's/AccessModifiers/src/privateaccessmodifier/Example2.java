package privateaccessmodifier;

public class Example2 /*extends Example1*/ {// CTE bcz super class constructor is private
	
//	public Example2(int b) { //if we needs to extends the super class which default constructor is private so we needs to put the parameterized super call state bcz in super class the parameterized constructor is public so we can call that constructor
//		super(b);
//	}

	public static void main(String[] args) {
		
//		System.out.println(Example1.a); // Private members are not visible outside the class
//		System.out.println(Example1.test1()); // CTE
		
		System.out.println(Example1.c); // public members
		
		Example1 e1 = new Example1(10);
		
		e1.getMethod(); // We can access the private members in another class using getterMethods
		
	}
}

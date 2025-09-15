package downcasting;

/*
 * How the Down casting Working and when.
 * If we Tries to Downcast without Up casting so we get CTE (ClassClassException).
 * Compile time Success bcz compiler not checks what is the type of Object, it checks only the type of ref var.
 * */


public class ABCDriver {
	public static void main(String[] args) {
		
//		ClassA a = new ClassB();  // Up Casting
//		ClassB b = (ClassB)a; // Down Casting Done
//		
//		ClassA a = new ClassC(); // Up Casting
//		ClassC c = (ClassC)a;  // Down Casting Done
		
//		ClassA a = new ClassB();  // Up Casting
//		ClassC c = (ClassC)a;  //ClassCastExeption
		
//		ClassA a = new ClassC();  // Up Casting
//		ClassB b = (ClassB)a; // Down Casting Done
		
//		ClassB b = new ClassC(); // Up Casting
//		ClassC c = (ClassC)b;  // Down Casting Done
	}
}

package assignment_1;

public class StaticVarDriver {
	
	public static void main(String[] args) {
		
		StaticVar obj1 = new StaticVar();
		StaticVar obj2 = new StaticVar();
		StaticVar obj3 = new StaticVar();
		
		System.out.println("Count From obj1 : " + obj1.count);
		System.out.println("Count From obj2 : " + obj2.count);
		System.out.println("Count From obj3 : " + obj3.count);
		System.out.println("Final Count Using className : " 
		+ StaticVar.count); // Recommended
		
	}
}

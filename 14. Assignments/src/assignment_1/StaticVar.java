package assignment_1;

public class StaticVar {
	
	static int count = 0;
	
	public StaticVar() {
		count++;
		System.out.println("Object Created, Count : " + count);
	}
}

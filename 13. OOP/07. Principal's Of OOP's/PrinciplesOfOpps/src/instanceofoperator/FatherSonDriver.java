package instanceofoperator;

import superkeyword.*;

public class FatherSonDriver {
	
	public static void main(String[] args) {
		
		Son s1 = new Son();
		
		System.out.println(s1 instanceof Son);
		System.out.println(s1 instanceof Father);
		
		Father f1 = new Father();
		
		System.out.println(f1 instanceof Father);
		System.out.println(f1 instanceof Son);
		
	}
}

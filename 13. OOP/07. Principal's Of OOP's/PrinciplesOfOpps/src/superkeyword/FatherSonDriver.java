package superkeyword;

public class FatherSonDriver {
	
	public static void main(String[] args) {
		
		Son s1 = new Son();
		
		System.out.println(s1.name);
		s1.displayName();
		
		s1.displayFatherSonDetails();
	}
}

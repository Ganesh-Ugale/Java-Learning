package superkeyword;

public class Son extends Father{
	
	String name =  "Sonu";
	
	public void displayName() {
		System.out.println("Son Name : " + name);
	}
	
	public void displayFatherSonDetails() {
		System.out.println("Son Name : " + name);
		System.out.println("Father Name : " + super.name);
//		System.out.println(super);
		displayName();
		super.displayName();
	}
}

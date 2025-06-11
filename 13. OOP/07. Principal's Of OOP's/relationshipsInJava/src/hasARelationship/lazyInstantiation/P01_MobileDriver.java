package hasARelationship.lazyInstantiation;

/*
 * This is Driver Class is helps to create an mobile class Object
 * 
 * */
public class P01_MobileDriver {
	public static void main(String[] args) {
		
//		Object Creation Statement
		P01_Mobile m1 = new P01_Mobile("IQOO", "IQOO Z7 Pro", 23500d, "5G");
		m1.displayMobile();
		
		System.out.println("---------------------------------------------");
		
//		Using Helper Method We can Access the SIM Object Members When we need
		m1.insertSim("ISP", "5G", "Prepaid", 8999169526l);
		m1.ref.displaySim();
	}
}

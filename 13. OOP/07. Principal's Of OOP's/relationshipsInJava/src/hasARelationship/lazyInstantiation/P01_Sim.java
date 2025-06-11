package hasARelationship.lazyInstantiation;
/*
 * Dependent Class(Sim)
 * 
 * */
public class P01_Sim {
//	Attributes
	String serviceProvider;
	String networkType;
	String type;
	long simNum;
	
	public P01_Sim() {
//		no-args constructor
	}
	
	public P01_Sim(String sprovider, String netType, String type, long simNum) {
		serviceProvider = sprovider;
		networkType = netType;
		this.type = type;
		this.simNum = simNum;
		
		System.out.println("Sim Object Created!");
	}
	
//	Non-static Methods
	public void displaySim() {
		System.out.println("Service Provider : " + serviceProvider);
		System.out.println("Network Type : " + networkType);
		System.out.println("Sim Number : " + simNum);
	}
}

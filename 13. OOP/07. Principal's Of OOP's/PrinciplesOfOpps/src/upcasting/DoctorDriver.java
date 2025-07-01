package upcasting;

public class DoctorDriver {
	
	public static void main(String[] args) {
		
//		Neurologiest n1 = new Neurologiest("Dr. Ganesh", 1000, "MBBS", 10, "Puna Hospital", 
//				"Neuro Spec", "Heart");
//		
//		n1.displayDoctor();
//		n1.displayNeurologiest();
		
		Doctor d1 = new Neurologiest(); // Up casting
		
		d1.displayDoctor(); // Now Neurologiest is can only shows the properties of Doctor class.

		System.out.println("--------------------------------------------------------");
		
		
		
		

		
	}
}

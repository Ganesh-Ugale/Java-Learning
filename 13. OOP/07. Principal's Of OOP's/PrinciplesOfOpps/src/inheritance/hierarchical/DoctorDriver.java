package inheritance.hierarchical;

public class DoctorDriver {
	
	public static void main(String[] args) {
		
		Cardiologiest c1 = new Cardiologiest("Dr. Ganesh Ugale", 1000, "MBBS", 10, "Puna Hospital",
				"Interventional Cardiology", "Heart");
		
		c1.displayDoctor();
		
		System.out.println("--------------------------------------");
		
		c1.displayCardiologiest();
		
		System.out.println("--------------------------------------");
		
		Neurologiest n1 = new Neurologiest("Dr. Aditya Matsagar", 2000, "HBMS", 15, "Thane Hospital",
				"Interventional Neorologiest", "Nervous System");
		
		n1.displayDoctor();		
		
		System.out.println("--------------------------------------");
		
		n1.displayNeurologiest();
		
		System.out.println("--------------------------------------");
		
		Orthologiest o1 = new Orthologiest("Dr. Sanket Tamnar", 100, "SBMS", 5, "International Hospital",
				"Interventional Orthologiest", "Brain");
		
		o1.displayDoctor();
		
		System.out.println("--------------------------------------");

		o1.displayOrthologiest();
	}
}

package upcasting;

public class Neurologiest extends Doctor{
	
	String specialization;
	String organ;
	
	public Neurologiest() {
		// TODO Auto-generated constructor stub
	}
	
	public Neurologiest(String docName, double fees, String degree, int experience, 
			String hospitalName, String specialization, String organ) {
		
		super(docName, fees, degree, experience, hospitalName);
		
		this.specialization = specialization;
		this.organ = organ;
	}
	
	public void displayNeurologiest() {
		displayDoctor();
		System.out.println("---|| Neurologiest Details ||---");
		
		System.out.println("Specialization : " + specialization);
		System.out.println("Oragans : " + organ);
	}
}

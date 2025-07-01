package upcasting;

public class Orthologiest extends Doctor{
	
	String specialization;
	String organ;
	
	public Orthologiest() {
		// TODO Auto-generated constructor stub
	}
	
	public Orthologiest(String docName, double fees, String degree, int experience, 
			String hospitalName, String specialization, String organ) {
		
		super(docName, fees, degree, experience, hospitalName);
		
		this.specialization = specialization;
		this.organ = organ;
	}
	
	public void displayOrthologiest() {
		displayDoctor();
		System.out.println("---|| Orthologiest Details ||---");
		
		System.out.println("Specialization : " + specialization);
		System.out.println("Oragans : " + organ);
	}
}
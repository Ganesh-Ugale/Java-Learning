package inheritance.hierarchical;

public class Cardiologiest extends Doctor{
	
	String specialization;
	String organ;
	
	public Cardiologiest() {
		// TODO Auto-generated constructor stub
	}
	
	public Cardiologiest(String docName, double fees, String degree, int experience, 
			String hospitalName, String specialization, String organ) {
		
		this.docName = docName;
		this.fees = fees;
		this.degree = degree;
		this.experience = experience;
		this.hospitalName = hospitalName;
		
		this.specialization = specialization;
		this.organ = organ;
	}
	
	public void displayCardiologiest() {
		displayDoctor();
		System.out.println("---|| Cardiologiest Details ||---");
		
		System.out.println("Specialization : " + specialization);
		System.out.println("Oragans : " + organ);
	}
}

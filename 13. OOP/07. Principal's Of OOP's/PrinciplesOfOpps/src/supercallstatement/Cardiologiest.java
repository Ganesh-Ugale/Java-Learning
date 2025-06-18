package supercallstatement;

// Constructor chaining
// If the programmer is fails to add the super call state so compiler will add the default super() call statement in the constructor body.
/*
 * It is mandatory to have a default constructor or no-args constructor in the parent class.
 * */
public class Cardiologiest extends Doctor{
	
	String specialization;
	String organ;
	
	public Cardiologiest() {
		// TODO Auto-generated constructor stub
	}
	
	public Cardiologiest(String docName, double fees, String degree, int experience, 
			String hospitalName, String specialization, String organ) {
		
//		Here this super() call state is calling to the super class constructor that constructor is accepting these parameters.
		super(docName, fees, degree, experience, hospitalName);
		
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
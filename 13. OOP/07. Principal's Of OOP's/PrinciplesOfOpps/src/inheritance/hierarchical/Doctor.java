package inheritance.hierarchical;

public class Doctor {
//	Properties
	String docName;
	double fees;
	String degree;
	int experience;
	String hospitalName;
	
//	no-args Constructor
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

//	parameterized Constructor
	public Doctor(String docName, double fees, String degree, int experience, String hospitalName) {
		
		this.docName = docName;
		this.fees = fees;
		this.degree = degree;
		this.experience = experience;
		this.hospitalName = hospitalName;
	}
	
//	Behaviors
	public void displayDoctor() {
		System.out.println("----|| Doctor Details ||---");
		System.out.println("Doctors Name : " + docName);
		System.out.println("Fees : " + fees);
		System.out.println("Degree : " + degree);
		System.out.println("Experience : " + experience);
		System.out.println("Hospital Name : " + hospitalName);
	}
	
	
}

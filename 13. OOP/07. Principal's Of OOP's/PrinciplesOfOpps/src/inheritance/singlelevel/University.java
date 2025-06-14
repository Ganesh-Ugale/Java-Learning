package inheritance.singlelevel;

public class University {
//	Properties
	String uniName;
	String state;
	int uniNumber;
	int uniEstYear;
	int numOfStaff;
	
//	No-Args Constructor
	public University() {
		// TODO Auto-generated constructor stub
	}
	
//	Parameterized Construct
	public University(String uniName, String state, int uniNumber, int uniEstYear, 
					  int numOfStaff) {
		this.uniName = uniName;
		this.state = state;
		this.uniNumber = uniNumber;
		this.uniEstYear = uniEstYear;
		this.numOfStaff = numOfStaff;
	}
	
//	Behaviors
	public void displayUniversity() {
		System.out.println("---|| University Details ||---");
		System.out.println("Name : " + uniName);
		System.out.println("State : " + state);
		System.out.println("University Num : " + uniNumber);
		System.out.println("Established Year : " + uniEstYear);
		System.out.println("Number of Staff : " + numOfStaff);
	}
}

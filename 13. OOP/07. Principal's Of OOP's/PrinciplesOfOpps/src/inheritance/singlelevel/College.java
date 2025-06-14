package inheritance.singlelevel;

public class College extends University{
//	Properties
	String collName;
	String city;
	int noOfDept;
	String grade;
	String priName;
	int collEstYear;
	
//	no-args constructor
	public College() {
		// TODO Auto-generated constructor stub
	}
	
//	parameterized constructor
	public College(String uniName, String state, int uniNumber, int uniEstYear, 
			int numOfStaff, String collName, String city, int noOfDept, 
			String grade, String priName, int collEstYear) {
		
		this.uniName = uniName;
		this.state = state;
		this.uniNumber = uniNumber;
		this.uniEstYear = uniEstYear;
		this.numOfStaff = numOfStaff;
		
		this.collName = collName;
		this.city = city;
		this.noOfDept = noOfDept;
		this.grade = grade;
		this.priName = priName;
		this.collEstYear = collEstYear;
	}
	
//	Behaviors
	public void displayCollege() {
		System.out.println("---|| University Details ||---");
		displayUniversity();
		
		System.out.println("---|| College Details ||---");
		System.out.println("College Name : " + collName);
		System.out.println("City : " + city);
		System.out.println("Num of Departments : " + noOfDept);
		System.out.println("Grade : " + grade);
		System.out.println("College Established Year : " + collEstYear);
	}
	
}

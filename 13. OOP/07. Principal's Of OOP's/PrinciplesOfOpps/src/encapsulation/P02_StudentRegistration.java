

package encapsulation;

class P02_StudentRegistration {
//	Private Attributes
	private String studName;
	private String colgName;
	private String yearOfAdm;
	private double fees = 50000d;
	private String dob;
	private char gender;
	private String course;
	private String duration = "6 Months";
	private String category;
	private int seatNum;
	private float sscMarks;
	private float hscMarks;
	private String address;
	private long phNum;
	private String bGroup;
	private boolean pemission = true;
	 
//	Parameterized Constructor for class loading
	public P02_StudentRegistration(String studName, String colgName, String yearOfAdm, 
			String dob, char gender, String course, String category, int seatNum, float sscMarks, 
			float hscMarks, String address, long phNum, String bGroup) {
		
		this.studName = studName;
		this.colgName = colgName;
		this.yearOfAdm = yearOfAdm;
		this.dob = dob;
		this.gender = gender;
		this.course = course;
		this.category = category;
		this.seatNum = seatNum;
		this.sscMarks = sscMarks;
		this.hscMarks = hscMarks;
		this.address = address;
		this.phNum = phNum;
		this.bGroup = bGroup;
	}
	
//	Design the getter and Setter Methods
	public String getSudName() {
		System.out.print("Your Name is : ");
		return studName;
	}
	
	public String getColgName() {
		System.out.print("Your College Name is : ");
		return colgName;
	}
	
	public String getYearOfAdm() {
		System.out.print("Your Year Of Admission is : ");
		return yearOfAdm;
	}
	
	public String getDob() {
		System.out.print("Your DOB is : ");
		return dob;
	}
	
	public char getGender() {
		System.out.print("Your Gender is : ");
		return gender;
	}
	
	public String getCourse() {
		System.out.print("Your Selected Course is : ");
		return course;
	}
	
//	Setter Method
	public void setCourse(String studName, int seatNum, String course) {
		if (this.studName == studName && this.seatNum == seatNum) {
			if (pemission) {
				this.course = course;
				System.out.println("Course Updated!");
			}else {
				System.out.println("You have No Permission!");
			}
		}else {
			System.out.println("Invalid Credentials!");
		}
	}
	
	public String getCategory() {
		System.out.print("Your Category is : ");
		return category;
	}
	
	public int getSeatNum() {
		System.out.print("Your Seat Num is : ");
		return seatNum;
	}
	
	public float getSscMarks() {
		System.out.print("Your SSC Marks is : ");
		return sscMarks;
	}
	
	public float getHscMarks() {
		System.out.print("Your HSC Marks is : ");
		return hscMarks;
	}
	
	public String getAddress() {
		System.out.print("Your Address is : ");
		return address;
	}
	
	public long getPhoneNum() {
		System.out.print("Your Phone Num is : ");
		return phNum;
	}
	
//	Setter Method
	public void setPhoneNum(String studName, int seatNum, long oldPhNum, long newPhNum) {
		if (pemission) {
			if (this.studName == studName && this.seatNum == seatNum && this.phNum == oldPhNum) {
				this.phNum = newPhNum;
				System.out.println("Your Phone Num is Updated!");
			}else {
				System.out.println("Invalid Credentials!");
			}
		}else {
			System.out.println("You Have No Permission!");
		}
	}
	
	public String getbloodGroup() {
		System.out.print("Your Blood Group is : ");
		return bGroup;
	}
	
	public double getFees() {
		System.out.print("Your Course Fees is : ");
		return fees;
	}
	
	public String getDuration() {
		System.out.print("Duration Of Course is : ");
		return duration;
	}
}

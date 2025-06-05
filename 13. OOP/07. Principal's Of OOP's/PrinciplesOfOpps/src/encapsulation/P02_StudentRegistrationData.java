package encapsulation;

public class P02_StudentRegistrationData {
	public String studName;
	public String colgName;
	public String yearOfAdm;
	public double fees;
	public String dob;
	public char gender;
	public String course;
	public String duration;
	public String category;
	public int rollNum;
	public int sscMarks;
	public int hscMarks;
	public String address;
	public long phNum;
	public String bGroup;

	public P02_StudentRegistrationData(double fees, String duration) {
		this.fees = fees;
		this.duration = duration;
	}
}
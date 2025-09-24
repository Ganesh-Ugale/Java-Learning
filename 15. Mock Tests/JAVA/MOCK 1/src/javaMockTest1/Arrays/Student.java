package javaMockTest1.Arrays;

public class Student {
	
	int sid;
	String name;
	String education;
	int yop;
	double percentage;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String name, String education, int yop, double percentage) {
		this.sid = sid;
		this.name = name;
		this.education = education;
		this.yop = yop;
		this.percentage = percentage;
	}
	
	public void sort(Student[] ar) {
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length-1-i; j++) {
				if (ar[j].name.compareToIgnoreCase(ar[j+1].name)<0) {
					Student temp  = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}
	
	public void displayStudents(Student[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	@Override
	public String toString() {
		return "["+"sid="+sid+", name="+name+", education="+education+", yop="+yop+", "
				+ "percentage="+percentage+"]";
	}
}

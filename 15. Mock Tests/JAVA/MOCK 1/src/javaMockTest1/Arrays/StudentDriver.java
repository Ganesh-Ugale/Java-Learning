package javaMockTest1.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student[][] ar = new Student[5][5];
		
		Student[] s = new Student[5];
		
		s[0] = new Student(1, "banana", "BE", 2025, 70.80);
		s[1] = new Student(2, "Apple", "BA", 2026, 78.80);
		s[2] = new Student(3, "cherry", "BCA", 2027, 76.80);
		s[3] = new Student(4, "Dewrw", "BSC", 2028, 50.80);
		s[4] = new Student(5, "E", "BBA", 2029, 90.80);
		
		ar[0] = s;
		
		ar[0][0].sort(s);
		
		ar[0][0].displayStudents(s);
	}
}

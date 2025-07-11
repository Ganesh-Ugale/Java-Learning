package assignment_1;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		System.err.println("Average Marks of Students");

		Student ganesh = new Student(80, 50, 66, 77, 89, 90, 95);
		System.out.println("Ganesh : " + ganesh.averageMarks());
		
		Student sakshi = new Student(40, 50, 86, 47, 85, 80, 90);
		System.out.println("Sakshi : " + sakshi.averageMarks());
		
		Student sanket = new Student(80, 50, 55, 77, 89, 75, 95);
		System.out.println("sanket : " + sanket.averageMarks());
		
		Student aditya = new Student(80, 60, 66, 46, 89, 67, 95);
		System.out.println("Aditya : " + aditya.averageMarks());
	}
}

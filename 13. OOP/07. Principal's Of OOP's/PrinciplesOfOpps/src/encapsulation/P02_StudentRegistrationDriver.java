package encapsulation;

class P02_StudentRegistrationDriver {
	public static void main(String[] args) {

//		Object Creation Statement
		P02_StudentRegistration s1 = new P02_StudentRegistration("Ganesh Ugale", "SVIT College",
				"12-12-2021", "25-04-2003", 'M', "Java Full Stake", "OBC", 35, 77.60f, 80.67f, 
				"Nashik", 8999169526l, "O+");
		
		System.out.println(s1.getSudName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getbloodGroup());
		System.out.println(s1.getCategory());
		System.out.println(s1.getColgName());
		System.out.println(s1.getCourse());
		System.out.println(s1.getDob());
		System.out.println(s1.getDuration());
		System.out.println(s1.getFees());
		System.out.println(s1.getGender());
		System.out.println(s1.getHscMarks());
		System.out.println(s1.getPhoneNum());
		System.out.println(s1.getSeatNum());
		System.out.println(s1.getSscMarks());
		
		System.out.println("----------------------------------------------------------------");
		
		s1.setCourse("Ganesh Ugale", 35, "Python Full Stack");
		System.out.println(s1.getCourse());
		
		s1.setPhoneNum("Ganesh Ugale", 35, 8999169526l, 7972862546l);
		System.out.println(s1.getPhoneNum());
	}
}

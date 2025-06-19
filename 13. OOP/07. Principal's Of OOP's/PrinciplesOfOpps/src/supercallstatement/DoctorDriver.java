package supercallstatement;

public class DoctorDriver {
	public static void main(String[] args) {
		
		Cardiologiest c1 = new Cardiologiest("Dr. Aditya", 1000,"MBBS" , 10, "Puna Hospital", 
				"Cardio", "Heart");
		
		c1.displayDoctor();
		
		System.out.println("--------------------------------------------------------------------");
		
		c1.displayCardiologiest();
	}
}

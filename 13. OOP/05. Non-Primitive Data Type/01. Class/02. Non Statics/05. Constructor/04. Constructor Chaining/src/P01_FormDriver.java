class P01_FormDriver{
	public static void main(String[] args) {
	
		P01_Form f1 = new P01_Form();
		f1.displayForm();		

		System.out.println("\n-------------------------------------------\n");

		// this constructor calling to that constructor body in blueprint that accepts String, long, char, String
		P01_Form f2 = new P01_Form("Ganesh", 8999169526l, 'M', "25/04/2003");
		f2.displayForm();	

		System.out.println("\n-------------------------------------------\n");

		P01_Form f3 = new P01_Form("Ganesh", 8999169526l, 'M', "25/04/2003", 4564255184l, "O+", "ugale.ganesh.d@gmail.com");
		f3.displayForm();	
	}
}
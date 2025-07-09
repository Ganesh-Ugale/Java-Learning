package assignment_1;

public class BookDriver {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("Aganipankh", "Dr. A.P.J.Abdul Kalam", 
				800, 1451154151512l);
		b1.displayBook();
		
		System.err.println("--------------------------------------------");
		
		Book b2 = new Book("Core Java", "John Smith", 499.99f, 
				9781234567890l, "TechBooks");
		b2.displayBook();
		
		System.err.println("--------------------------------------------");
		
		Book b3 = new Book("Python", "Sara Johnson", 600.50f, 
				9789876543210l, "CodeWorld", 400, (short)2021);
		b3.displayBook();
	}
}

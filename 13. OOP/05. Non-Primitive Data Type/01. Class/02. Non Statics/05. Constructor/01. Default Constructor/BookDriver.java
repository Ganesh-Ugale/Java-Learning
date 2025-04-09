class BookDriver{
	public static void main(String[] args) {
	
		// Creating Object	
		Book b1 = new Book();

		// Assigning Values to the var
		b1.brand = "Classmate";
		b1.price = 50d;
		b1.color = "Orange";
		b1.noOfPages = 200;

		// Calling method
		b1.displayBook(); 
	}
}
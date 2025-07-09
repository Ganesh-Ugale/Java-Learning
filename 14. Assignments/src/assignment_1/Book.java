package assignment_1;

public class Book {
	String title;
	String author;
	String publisher;
	float price;
	int pages;
	long isbn;
	short publishedYear;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

//	Constructor Overloading
	public Book(String title, String author, float price, long isbn) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	
	public Book(String title, String author, float price, long isbn,
			String publisher) {
		this(title, author, price, isbn);
		this.publisher = publisher;
	}
	
	public Book(String title, String author, float price, long isbn,
			String publisher, int pages) {
		this(title, author, price, isbn, publisher);
		this.pages = pages;
	}
	
	public Book(String title, String author, float price, long isbn,
			String publisher, int pages, short publishedYear) {
		this(title, author, price, isbn, publisher, pages);
		this.publishedYear = publishedYear;
	}
	
//	display method
	public void displayBook() {
		System.out.println("Book Details");
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
		System.out.println("ISBN NO : " + isbn);
		System.out.println("Publisher : " + publisher);
		System.out.println("Pages : " + pages);
		System.out.println("Published Year : " + publishedYear);
	}
}

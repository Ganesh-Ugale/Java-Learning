// Understanding Method Binding Process using Currency Converter Program
import java.util.Scanner;
class P02_CurrConverter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Currency in rupee : ");
		double currency = sc.nextDouble();
		System.out.println("Main Start");
		rupeeToDoller(currency); // Method Calling
		System.out.println("Main End");
	}
	// Methods Definitions
	public static void rupeeToDoller(double rupee){
		System.out.println("rupeeToDoller Start");
		double doller = rupee / 87.15;
		System.out.println("Rupee to Doller : " + doller);
		dollerToEuro(doller); // Method Binding
		System.out.println("rupeeToDoller End");
	}	
	public static void dollerToEuro(double doller){
		System.out.println("dollerToEuro Start");
		double euro = doller * 0.95;
		System.out.println("Doller to Euro : " + euro);
		euroToDhirum(euro); // Method Binding
		System.out.println("dollerToEuro End");
	}
	public static void euroToDhirum(double euro){
		System.out.println("euroToDhirum Start");
		double Dhirum = euro * 3.85;
		System.out.println("Euro to Dhirum : " + Dhirum);
		System.out.println("euroToDhirum End");
	}
}
import java.util.Scanner;

class ScannerInput
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter a Number1: ");
		short var1 = sc.nextShort();
		System.out.println("You Entered: " + var1);

		System.out.print("Enter a Word: ");
		String var2 = sc.next();
		System.out.println("You Entered: " + var2);
	// Need to clear a buffer memory
		System.out.print("Enter a String: ");
		String var3 = sc.nextLine();
		System.out.println("You Entered: " + var3);
	}
}
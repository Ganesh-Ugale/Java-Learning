// ASCII to Char Table Print from user enterd range to specific range using for loop
import java.util.Scanner;
class AsciiToCharTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Start ASCII Value : ");
		byte num = sc.nextByte();
		System.out.print("\nEnter Range of ASCII Value : ");
		byte range = sc.nextByte();

		System.out.print("\n  ASCII    CHAR\n");

		for ( ; num <= range ; num++ )
		{
			System.out.println("    " + num + "   :   " + (char)num);
		}

		System.out.println("\n------------------|| Thank You! ||------------------");
	}
}
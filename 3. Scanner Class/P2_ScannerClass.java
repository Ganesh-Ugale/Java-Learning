import java.util.Scanner;

class ScannerClass
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

// Accepting a 1st num
		System.out.print("Enter Num1: ");
		byte num1 = sc.nextByte();
		System.out.println(num1);

// accepting a 2nd num
		System.out.print("Enter Num2: ");
		byte num2 = sc.nextByte();
		System.out.println(num2);

		System.out.print("Output is: "+ (num1 + num2));
	}
}
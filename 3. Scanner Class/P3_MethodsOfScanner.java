import java.util.Scanner;

class MethodsOfScanner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextByte();
		short b = sc.nextShort();
		int c = sc.nextInt();
		long d = sc.nextLong();
		float e = sc.nextFloat();
		double h = sc.nextDouble();
		// here we need to enter a nextLine() method to clear a buffer
		String f = sc.nextLine();
		boolean g = sc.nextBoolean();
	}
}
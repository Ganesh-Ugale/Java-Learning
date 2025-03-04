import java.util.Scanner;

class CharToAsciiTable
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Char : ");
		char ch = sc.next().toUpperCase().charAt(0);
		System.out.print("Enter the range : ");
		char range = sc.next().toUpperCase().charAt(0);
		
		for ( ; ch <= range; ch++)
		{
			System.out.println(ch + " : " + (ch+0)+" "); // OR ch * 1
		}
	}
}
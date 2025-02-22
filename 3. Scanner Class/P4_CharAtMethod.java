import java.util.Scanner;

class ChatAtMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	

		System.out.print("Enter a Word: ");
		char ch = sc.next().charAt(2);
		System.out.print(ch);
	}
}
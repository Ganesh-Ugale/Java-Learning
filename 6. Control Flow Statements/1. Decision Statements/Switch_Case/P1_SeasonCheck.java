/*
 * Write an Program to Season Check Using Switch Case Statements
 */
import java.util.Scanner;
class SeasonCheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n============================|| WELCOME ||============================\n");
		System.out.println("1. JAN");
		System.out.println("2. FEB");
		System.out.println("3. MAR");
		System.out.println("4. APR");
		System.out.println("5. MAY");
		System.out.println("6. JUN");
		System.out.println("7. JUL");
		System.out.println("8. AUG");
		System.out.println("9. SEP");
		System.out.println("10. OCT");
		System.out.println("11. NOV");
		System.out.println("12. DEC");

		System.out.print("\nEnter Month Name : ");
		String month = sc.next().toUpperCase();

		switch (month)
		{
			case "OCT":
			case "NOV":
			case "DEC":
			case "JAN":
						{
							System.out.println("\n" + month + " IS WINTER SEASON MONTH");
							break;
						}
			case "FEB":
			case "MAR":
			case "APR":
			case "MAY":
						{
							System.out.println("\n" + month + " IS SUMMER SEASON MONTH");
							break;
						}
			case "JUN":
			case "JUL":
			case "AUG":
			case "SEP":
						{
							System.out.println("\n" + month + " IS MONSOON SEASON MONTH");
							break;
						}
			default:
					 {
						System.out.println("\nINVALID MONTH");
						break;
					 }
		}
		
		System.out.println("\n------------------------> Thank You! ------------------------");
	}
}
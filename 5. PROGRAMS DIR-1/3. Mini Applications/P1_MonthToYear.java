import java.util.Scanner;
class MonthToYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Month : ");
		int month = sc.nextInt();

		int year = month/12;
		int remMonth = month%12;
		String str = year + "."+remMonth; // Method 1
		//String str = year+ " Years" + " & "+remMonth + " Months"; // Method 2 direct str print
		float con = Float.parseFloat(str);
		System.out.println(con);
	}
}
/* */



import java.util.Scanner;

class TipCalculation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Bill Amount: ");
		float billAmount = sc.nextFloat();

		System.out.println("Enter the tip rate: ");
		float tipRate = sc.nextFloat();

		float tipAmount = (tipRate*billAmount)/100;
		float totalBill = billAmount + tipAmount;

		System.out.println("Total Bill is: " + totalBill);
		System.out.println("Tip Added is: " + tipAmount);
	}
}
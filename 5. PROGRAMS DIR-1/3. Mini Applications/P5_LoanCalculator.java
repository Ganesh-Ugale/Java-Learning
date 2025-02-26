/*
 * Mini Application of  Loan Calculator an Calculate the ROI with the Total Amount and EMI
 */

import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("------------------------ Loan Calculator ------------------------");
		System.out.println();
		System.out.print("Enter the Amount : ");
		float userAmount = sc.nextFloat();
		System.out.print("Enter the ROI : ");
		float roi = sc.nextFloat();
		System.out.print("Enter the tenure (Months) : ");
		int months = sc.nextInt();

		// Conversion of months to year and remaining months
		String str = (months/12) + "." + (months%12);
		float yearsMonths = Float.parseFloat(str);
		
		System.out.println();
		System.out.println("===================|| Loan Calculation ||===================");
		System.out.println();
		System.out.println("Princial Amount : " + "Rs. " + userAmount);
		System.out.println("ROI : " + roi + "%");
		System.out.println("Tenure : " + months + " Months");
		System.out.println();

		float interest = (userAmount*roi)/100;
		float totalInt = interest * yearsMonths;
		System.out.println("Total Interset : " + "Rs. " +  totalInt);
		float totalAmount = userAmount + totalInt;
		System.out.println("Total Amount : " + "Rs. " +  totalAmount);
		System.out.println("EMI/Month : " + "Rs. " + (totalAmount/months));
		System.out.println();
		System.out.println("------------------------> Thank You! <------------------------");
	}
}
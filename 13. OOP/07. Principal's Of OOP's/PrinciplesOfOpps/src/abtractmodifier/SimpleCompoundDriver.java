package abtractmodifier;

// Service User Class

import java.util.Scanner;

public class SimpleCompoundDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleCompoundInterest sci = new SimpleCompoundImp();
		
		System.out.println("1. Simple Interest");
		System.out.println("2. Compound Interest");
		System.out.println();
		System.out.print("Choose Option : ");
		byte op = sc.nextByte();
		
		switch (op) {
		case 1: {
			System.err.println("\n----|| Simple Interest ||----");
			System.out.print("Enter Principal Amount : ");
			float principal = sc.nextFloat();
			
			System.out.print("Enter ROI : ");
			float roi = sc.nextFloat();
			
			System.out.print("Enter time period : ");
			float time = sc.nextFloat();	
			
			System.out.println("\nSimple Interest on amount " 
			+ principal + " is " + sci.simpleInt(principal, roi, time));
			
			System.err.println("\nTotal Amount : " + 
			(principal + sci.simpleInt(principal, roi, time)) );
			
			System.out.println("\n-----------------------------------------------");
			
			break;
		}
		
		case 2: {
			System.err.println("\n----|| Compound Interest ||----");
			System.out.print("Enter Principal Amount : ");
			float principal = sc.nextFloat();
			
			System.out.print("Enter ROI : ");
			float roi = sc.nextFloat();
			
			System.out.print("Enter time period : ");
			float time = sc.nextFloat();	
			
			System.out.println("\nCompound Interest on amount " + principal + " is " 
					+ sci.compoundInt(principal, roi, time));
			
			System.err.println("\nTotal Amount : " + 
			(principal + sci.compoundInt(principal, roi, time)));
			
			System.out.println("\n-----------------------------------------------");
			
			
			break;
		}
		default:
			System.err.println("\nInvalid Option!");
		}
		sc.close();
	}
}

/*
 * Write an Program of Student is Eligible for Scholarship basis on marks Using Simple if Statement
 */

import java.util.Scanner;

class ScholarshipEligible
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Marks: ");
		float studMarks= sc.nextFloat();

		float per = (studMarks*100)/500;

		if(per>=85) // Simple if Statement 
		{
			System.out.println("Student is Eligible for Scholarship");
		}
		System.out.println("Student Permite for Admission");
	}
}
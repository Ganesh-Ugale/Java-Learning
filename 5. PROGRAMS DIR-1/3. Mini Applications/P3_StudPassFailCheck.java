/*
Mini Application of Student is Pass or Fail with Grade System
 */
import java.util.Scanner;

class PassFail
{
	public static void main(String[] args)
	{
		System.out.print("Enter Marks : ");
		float userMarks = new Scanner(System.in).nextFloat();		

		float per = (userMarks*100)/600;
		//System.out.println(per);
		
		// Type 1
		//String op = (per>=1 && per<35)?("Student is Fail"):((per>=35 && per<=100)?("Pass"):("Invalid Data"));
		//System.out.println(op);

		// Type 2
		//String op1 = (userMarks<0 || userMarks>600)?(userMarks + " INVALID MARKS ENTERD"):((per>=1 && per<35)?(per + " FAIL"):((per>=35 && per<=100)?(per + " PASS"):("INVALID INPUT")));
		//System.out.println("RESULT 1: " + op1);

		// Type 3 with Grade
		String op2 = (userMarks<=0 || userMarks>600)?("INVALID MARKS ENTERED"):
			((per>=75 && per<=100)?(per + " PASS WITH A GRADE"):
			((per>=50 && per<74)?(per + " PASS WITH B GRADE"):
			((per>=35 && per<50)?(per + " PASS WITH C GRADE"):
			(per + " FAIL"))));

		System.out.println(op2);
	}

}
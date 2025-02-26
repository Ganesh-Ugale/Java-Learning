/*
 * Create an Small Arithmatic Calulator 
 */

import java.util.Scanner ;

class ArithmaticCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num1 : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter Num2 : ");
		float num2 = sc.nextFloat();

		System.out.print("Enter Operator: ");
		char operator = sc.next().charAt(0);

		String op = 
			(operator == '+')?(num1 + " + " + num2 + " = " + (num1 + num2)):
			((operator == '-')?(num1 + " - " + num2 + " = " + (num1 - num2)):
			((operator == '*')?(num1 + " * " + num2 + " = " + (num1 * num2)):
			((operator == '/')?(num1 + " / " + num2 + " = " + (num1 / num2)):
			((operator == '%')?(num1 + " % " + num2 + " = " + (num1 % num2)):
			("INVALID OPRATION PERFORM")))));

		// OR float op = and change the all ternary true and false places only put num1+num2
		// and in the last String output= num1+" "+op+ ________ get the output
		// in last line in the place of String 0.0000001f
		// if(!(opt == 0.0000001f)){
		//      S.O.P(output)}

		System.out.println(op);
	}
}
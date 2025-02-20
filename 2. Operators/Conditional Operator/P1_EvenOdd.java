class EvenOdd
{
	public static void main(String[] args)
	{
		// Conditional Operator OR Ternary Operator '?'

		float num = 5;

		// To check the Num is Even or Odd using Ternarry Operator
		String check = num%2==0 ? 1 + " Even"  : 0 + " Odd" ; // in the String int type of Literals or float types of literals or Num are can't Store it gives error: incompatible types: int cannot be converted to String. But if any String is added in the operation with + operator so it can converted to string and store in op.
		System.out.println("Num " + num + " is: " + check);
	}
}
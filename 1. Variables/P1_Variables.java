/*
 * Some Basic Operations on Variables, Learn How can data Stores a Variables using Data Type
 */

class Variables
{
	public static void main(String[] ganesh)
	{
		// Variable Declaration with Initialization
		byte rollNo = 50; // here the 35 is treated as a int type of literal by default, but the java compiler checks the 35 is can fits into byte? Yes, So java converts into byte. ### same for other Interger data types like short long. 
		short roomNo = 100; // ----||----
		int age = 2147483647;
		long mobileNo = 89991; // works fine without L/l because 8999 is within the int range and Java converts it to long automatically.
		long phoneNo = 8999169526L; // without using L/l it gives CTE the int num is too large bcz its exceds the int range.
		float sallary_=278876; // after run 504564.0 bcz int to float is possible.
		float salarry = 50000.3656f; // Without using f/F it consider the value is double and double to float conversion is not possible. The Default type of Decimal numbers is double
		double salarry1 = 8844555.5555454545454544545455d; // D/d is Optional
		char char1 = '9';// or 'A' any one char from A-Z/a-z/0-9. The Default type of char literal is char always
		boolean decision = true;

		//long a = 10;
		//int b = a; // gives error bcz long to int not possible normally
		//System.out.println(a);
		
		System.out.println("rollNo: " + rollNo);
		System.out.println("roomNo: " + roomNo );
		System.out.println("age: " + age);
		System.out.println("mobileNo: " + mobileNo);
		System.out.println("phoneNo: " + phoneNo);
		System.out.println("sallary_: " + sallary_);
		System.out.println("salarry: " + salarry);
		System.out.println("salarry1 " + salarry1);
		System.out.println("char1: " + char1);
		System.out.println("decision: " + decision);

		// Some Mix Operations testing
	//	byte aaa = 2;
	//	char bbb = 3;
	//	int ccc = aaa + bbb; // Successfully result store and print bc java automatically promot the smaller data types like byte short char into int.
	//	System.out.println("byte+char=int " + ccc);

	//	byte aa = 2;
	//	char bb =(char)aa; //2
	//	int cc = aa + bb; // to store the reslut need narrowing bcz byte to short conversion not possible whaterver the byte is small but the variable is can be change in future
	//	System.out.println("byte+char=int " + cc);

	//	int a_ = 10;
		//float b_ 40;
	//	double = 
		//System.out.println("int+float=double " + cc);


	}
}
/*
1. This is a Constructor name as Student()
2. In this Blueprint We added a no args Constructor with some body also.
3. So First the Constructor is called and Start Loading Process.

			--------- Constructor Loading -----------------

4. Constuctor has two Parts LI(Loading Instruction Stage) & UDLI(User Defined 
   Loading Instruction Stage).

       Constructor
	+--------------+
    |      LI      | -------> First Execute this part	  
	+--------------+		
    |     UDLI     | -------> Second Execute this part
	+--------------+

5. In the Loading Instruction Stage i.e LI  Done as Following---> 
	i. non-static var declaration and Initialization Statements if given
	ii. non-static var declaration with default value
	iii. non-static method loading if given
	iv. non static block if given

6. In the User Definede Loading Instructions stage i.e UDLI Done as Following--->
    i. constructor block/body is get executed if it is given

NOTE: Constructor is not static and nor non-static so it not load anywhere 
	  except the method block, it only helps in loading the Object.

*/

class P01_Student{

	String name;
	int age;
	String college;
	String degree;
	int roll;

	// No-args Constructor (UDLI means User Defined Loading Instructions)
	P01_Student()
	{
		System.out.println("\n--------|| UDLI Start ||--------\n");
		System.out.println("From no args Constructor!");
		System.out.println("Current Object ref from no args constructor: " + this);
		System.out.println("\n--------|| UDLI Ends ||--------\n");
	}

	public void displayStudent()
	{
		String name = "Mighty Raju"; // Local var & non static var name is same

		System.out.println("\nName(LocalVar) : " + name); // calling local
		System.out.println("Name : (Object Var) : " + this.name); // calling non static
		System.out.println("Current Obj Ref : " + this);
		System.out.println("Age : " + age);
		System.out.println("College : " + college);
		System.out.println("Degree : " + degree);
		System.out.println("Roll : " + roll + "\n");
	}
}
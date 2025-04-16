/*
1. no-args Constructor & Parameterized Constructor
2. Note: One time only once Contructor is loading object.
3. here if we call 1st no-args constructor so javac do the binding with constructor call and 
   constructor body, and load the var in obj with default values.
4. If we Call in next to create new Object using para-constructor so this constructor assign
   the value to the non-static var at object loading process in UDLI stage.

5. PRECEDENCE OF NON-STATIC MEMBER LOADINGS IN OBJECT BY CONSTRUCTOR--->
---------- IN LI Stage -------------
   i) non-static Initializers (Non static declare and initilization)
   ii) non-static Var Declaration with defalut values
   iii) non-static user-defined methods
   iv) Non-static Block

--------- IN UDLI Stage ------------
	i) Constructor  Body/ Block

6. In this way the constructor is loading the non-static members in Object

*/

class P02_Student{
		
		// non-static var declaration statements
		String name;
		int age;
		String college;
		String degree;
		int roll;

		// no-args constructor
		P02_Student()
		{	 
			System.out.println("\n-------|| No args Constructor UDLI Starts ||-------\n");
			System.out.println("From no args Constructor");
			System.out.println("Current Obj ref print from no args constructor: " + this);
			System.out.println("\n-------|| No args Constructor UDLI Ends ||-------\n");
		}

		// parameterized constructor
		P02_Student(String name, int age, String college, String degree, int roll)
		{
			System.out.println("\n-------|| Parameterized Constructor UDLI Starts ||-------\n");

			// we can call method here so we get default values of non-static var
			displayStudent();  

			System.out.println("Value Assigning...");
			System.out.println("Current Obj ref print from parameterized constructor: " + this);
			
			// this for to store the RHS value to LHS non-static var
			this.name = name;  
			this.age = age;
			this.college = college;
			this.degree = degree;
			this.roll = roll;
			System.out.println("\n-------|| Parameterized Constructor UDLI Ends ||-------\n");
		}

		// user-defined non-static method
		public void displayStudent()
		{
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("College : " + college);
			System.out.println("Degree : " + degree);
			System.out.println("Roll : " + roll);
		}
	
}
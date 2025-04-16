/*
1. Parameterized Constructor---->

2. In Parameterized Constructor we Create an Constructor with Formal Args in blueprint 
   class.
3. Then Pass the Values in Driver class to the Constuter class with new keyword.
4. So here we Assign the values While constructor Loading the Object at that time in 
   UDLI stage the Constructor done with loading the values to non-static var.
5. We neeed to Write an this keyword for to assign a value to non-static var.
6. bcz the var declared in the formal args are local to that block only, so we need to write an 
   this keyword to that var those store an value to non-static var.
7. 

*/
class P01_Student{
		
		// non-static var declaration statements
		String name;
		int age;
		String college;
		String degree;
		int roll;

		// parameterized constructor
		P01_Student(String name, int age, String college, String degree, int roll)
		{
			System.out.println("\n-------|| Parameterized Constructor UDLI Starts ||-------\n");
			System.out.println("Value Assigning...");
			// this keyword with LHS var means the RHS var value is assign to object var directly.
			this.age = age;
			this.name = name; 
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
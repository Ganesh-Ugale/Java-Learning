/*
1. How to Oveload the Constructor.
2. In Single Class we can have Multiple Constructor but having different type, 
   len og args.
3. Constructor Overloading menas "A Class having more than one constructor".
4. We can Overload a constructor but it must having either differnt type of args 
   OR Different in length of args.
5. Constructor Binding is also there which is happes in compile time, 
   Compiler Checks for the Actual and Formal Args type OR len
   Ex: in Dirver class if anyone constructor we pass (String, int, long, String)
   So the compiler checks in blueprint is any contructor is define that have
   (String, int, long, String), if yes then binding done, if no it throws an error.
6. This is also a one type of Polymorphism
7. no-args constructor is mandatory to add in each program it's a duty of 
   programer.
8. Why need the constructor Overloading?---> bcz When we want to coustomize the
   loading of the values to the object members at that time Constructor Overloading is benefitial.

*/

class P01_Form{

	// Attributes/ Properties
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;

	// no-args constructor is mandatory to add in each program it's a duty of programer
	P01_Form()
	{
		System.out.println("-----| From Constructor 1 |-----");
	}

	// Constructor Overloadings
	P01_Form(String name, long phno, char gen, String dob){
		System.out.println("-----| From Constructor 2 |-----");
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
	}

	P01_Form(String name, long phno, char gen, String dob, long tel){
		System.out.println("-----| From Constructor 3 |-----");
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		// Not Mendatory Details for form collector
		this.tel = tel;
	}

	P01_Form(String name, long phno, char gen, String dob, long tel, String blood){
		System.out.println("-----| From Constructor 4 |-----");
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		// Not Mendatory Details for form collector
		this.tel = tel;
		this.blood = blood;
	}

	P01_Form(String name, long phno, char gen, String dob, long tel, String blood, String email){
		System.out.println("-----| From Constructor 5 |-----");
		this.name = name;
		this.phno = phno;
		this.gen = gen;
		this.dob = dob;
		// Not Mendatory Details for form collector		
		this.tel = tel;
		this.blood = blood;
		this.email = email;
	}


	// Actions/ Behaviours
	public void displayForm(){
		System.out.println("Name : " + name);
		System.out.println("Phone No. : " + phno);
		System.out.println("Tel No. : " + tel);
		System.out.println("Gender : " + gen);
		System.out.println("Blood : " + blood);
		System.out.println("Email : " + email);
		System.out.println("DOB : " + dob);
	}
}
package abtractmodifier;

// Service Specifier Class

public abstract class Shapes extends NumberProgramImp{ 
	final static double pi = 3.142857d; // we can rearrange the place of static and final also.
	
//	Abstract Methods
	public abstract void circle(float rad);
	public abstract void square(float side);
	public abstract void rectangle(float length, float breadth);
	public abstract void traingle(float base, float height, float s1, float s2, float s3);
	public abstract void eqiTraingle(float side);
	
	public void cube(float side) { // Concrete Method
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Cube : " + 6 * pow(side,2));
		System.out.println("Parameter of Cube : " + pow(side, 3));
		System.err.print("-------------------------------------------------");
	}
	
	public abstract void sphere(float rad);
	public abstract void hemisphere(float rad);
	public abstract void cylinder(float rad, float height);
	
	public void parallelograpm(float base, float height, float side) {// Concrete Method
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Parallelogram : " + (base * height));
		System.out.println("Perimeter of Parallelogram : " + (2 * (base + side)));
		System.err.print("-------------------------------------------------");
	}
}

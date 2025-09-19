package abtractmodifier;

// Area and Parameter Implementation class
// Service Provider Class

/*here this NumberProgramImp inherited bcz i want to access the pow method 
from this method.
*/
public class AreaParameterImp extends Shapes{
		
//	Implementation methods

	public void circle(float rad) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Circle : " + (pi * pow(rad, 2)));
		System.out.println("Perimeter of Circle : " + (2 * pi * rad));
		System.err.print("-------------------------------------------------");
	}
	
	public void square(float side) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Square : " + (pow(side, 2)));
		System.out.println("Perimeter of Square : " + (4 * side));
		System.err.print("-------------------------------------------------");
	}
	
	public void rectangle(float length, float breadth) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Rectangle : " + (length * breadth));
		System.out.println("Perimeter of Rectangle : " + (2 * (length + breadth)));
		System.err.print("-------------------------------------------------");
	}
	
	public void traingle(float base, float height, float s1, float s2, float s3) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Traingle : " + (0.5 * base * height));
		System.out.println("Perimeter of Traingle : " + (s1 + s2 + s3));
		System.err.print("-------------------------------------------------");
	}
	
	public void eqiTraingle(float side) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Equilateral  Traingle : " + (pow(3, 0.5f)/4) * pow(side, 2));
		System.out.println("Perimeter of Equilateral Traingle : " + (3 * side));
		System.err.print("-------------------------------------------------");
	}
	
	public void sphere(float rad) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of Sphere : " + (4 * pi * pow(rad, 2)));
		System.out.println("Perimeter of Sphere : " + ((4/3) * pi * pow(rad, 3)));
		System.err.print("-------------------------------------------------");
	}
	
	public void hemisphere(float rad) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of hemisphere : " + (3 * pi * pow(rad, 2)));
		System.out.println("Perimeter of hemisphere : " + ((0.6) * pi * pow(rad, 3)));
		System.err.print("-------------------------------------------------");
	}
	
	public void cylinder(float rad, float height) {
		System.err.println("-------------------------------------------------");
		System.out.println("Area of cylinder : " + (2 * pi *(height + rad)));
		System.out.println("Perimeter of Cylinder : " + (pi * pow(rad, 2) * height));
		System.err.print("-------------------------------------------------");
	}
}

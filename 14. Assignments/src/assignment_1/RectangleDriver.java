package assignment_1;

public class RectangleDriver {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(8, 4);
		System.out.println("Area of Rectangle1 : " + r1.areaOfRectangle());
		System.out.println("Perimeter of Rectangle1 : " + r1.perimeterOfRectangle());

		System.err.println("---------------------------------------");
		
		Rectangle r2 = new Rectangle(10, 4);
		System.out.println("Area of Rectangle2 : " + r2.areaOfRectangle());
		System.out.println("Perimeter of Rectangle2 : " + r2.perimeterOfRectangle());

		System.err.println("---------------------------------------");
		
		Rectangle r3 = new Rectangle(8, 2);
		System.out.println("Area of Rectangle3 : " + r3.areaOfRectangle());
		System.out.println("Perimeter of Rectangle3 : " + r3.perimeterOfRectangle());

	}
}

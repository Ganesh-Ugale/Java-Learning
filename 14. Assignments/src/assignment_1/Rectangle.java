package assignment_1;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle() {}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double areaOfRectangle() {
		return length * width;
	}
	
	public double perimeterOfRectangle() {
		return 2 * (length + width);
	}
}

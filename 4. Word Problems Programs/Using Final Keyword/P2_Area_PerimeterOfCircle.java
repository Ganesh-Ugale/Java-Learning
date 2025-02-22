/*Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 
perimeter = 2 * pi(3.14) * radius
area = pi(3.14) * radius * radius
 */


class Area_PerimeterOfCircle
{
	public static void main(String[] args)
	{
		// Calculate area and Perimeter of Circle

		final float radius = 5.5f; // final keyword used here
		
		// Calculate Area of Circle
		float area = (22f/7f)*radius*radius;
		// Calculate Perimeter of Cicle
		float perimeter= 2f * (22f/7f) * radius;
		
		System.out.println("Area of Cicle having 5.5cm redius is: " + area);
		System.out.println("Perimeter of Circle having 5.5cm redius is: " + perimeter);
	}
}
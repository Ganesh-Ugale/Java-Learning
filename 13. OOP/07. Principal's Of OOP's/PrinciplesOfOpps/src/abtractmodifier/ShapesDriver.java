package abtractmodifier;

// Service user class

import java.util.Scanner;
public class ShapesDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shapes s1 = new AreaParameterImp(); // Up casting to achieve generalization
		
		System.out.println("----|| Area & Perimieter ||----");
		System.out.println("1. Circle");
		System.out.println("2. Square");
		System.out.println("3. Rectangle");
		System.out.println("4. Triangle");
		System.out.println("5. Equilateral Triangle");
		System.out.println("6. Cube");
		System.out.println("7. Sphere");
		System.out.println("8. Hemisphere");
		System.out.println("9. Cylinder");
		System.out.println("10.Parallelogram\n");
		System.out.print("Choose Option : ");
		byte op = sc.nextByte();
		
		switch (op) { // Switch Statement
		case 1: {
					System.out.print("\nEnter Radius : ");
					float ip = sc.nextFloat();
					s1.circle(ip);
					break;
				}
		
		case 2: {
					System.out.print("Enter side : ");
					float ip = sc.nextFloat();
					s1.square(ip);
					break;
				}
		
		case 3: {
					System.out.print("Enter Length & Breadth : ");
					float ip1 = sc.nextFloat();
					float ip2 = sc.nextFloat();
					s1.rectangle(ip1, ip2);
					break;
				}
		
		case 4: {
					System.out.print("Enter base & heigth : ");
					float ip1 = sc.nextFloat();
					float ip2 = sc.nextFloat();
					System.out.print("Enter side1 side2 side3 : ");
					float ip3 = sc.nextFloat();
					float ip4 = sc.nextFloat();
					s1.traingle(ip1, ip2, ip3, ip4, ip4);
					break;
				}
		
		case 5: {
					System.out.print("Enter side : ");
					float ip1 = sc.nextFloat();
					s1.eqiTraingle(ip1);
					break;
				}
		
		case 6: {
					System.out.print("Enter side : ");
					float ip1 = sc.nextFloat();
					s1.cube(ip1);
					break;
				}
		
		case 7: {
					System.out.print("Enter radius : ");
					float ip1 = sc.nextFloat();
					s1.sphere(ip1);
					break;
				}
		
		case 8: {
					System.out.print("Enter radius : ");
					float ip1 = sc.nextFloat();
					s1.hemisphere(ip1);
					break;
				}
		
		case 9: {
					System.out.print("Enter radius & height : ");
					float ip1 = sc.nextFloat();
					float ip2 = sc.nextFloat();
					s1.cylinder(ip1, ip2);
					break;
				}
		
		case 10: {
					System.out.print("Enter base height side: ");
					float ip1 = sc.nextFloat();
					float ip2 = sc.nextFloat();
					float ip3 = sc.nextFloat();
					s1.parallelograpm(ip1, ip2, ip3);
					break;
				}
		default:
			System.out.println("\nInvalid Option!");
		}
		sc.close();
	}
}

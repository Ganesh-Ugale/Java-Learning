package assignment_1;

public class Car {
	String model;
	String color;
	String speed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String color, String speed) {
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
	public void displayCar() {
		System.out.println("Model : " + model);
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
	}
}

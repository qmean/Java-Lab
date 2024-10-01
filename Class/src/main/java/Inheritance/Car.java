package Inheritance;

public class Car extends Vehicle{
	public String model;
	public String color;

	public Car(String model) {
		this.model = model;
	}

	public void printColor() {
		System.out.println("Color of the car is " + this.color);
		System.out.println("Color of the vehicle is " + super.color);
	}
}

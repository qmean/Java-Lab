package Inheritance;

public class Vehicle {
	public String name;
	public String color;

	public Vehicle() {
	}

	public Vehicle(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void move() {
		System.out.println("Vehicle is moving");
	}
}

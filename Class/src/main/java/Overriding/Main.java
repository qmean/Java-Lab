package Overriding;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.move();
		Child child = new Child();
		child.move();
	}
}

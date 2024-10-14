package Anonymous;

public class ClassLevel {

	public static void main(String[] args) {
		// Anonymous class
		Animal animal = new Animal() {
			@Override
			void eat() {
				System.out.println("Animal is eating");
			}
		};

		Unit unit = new Unit() {
			@Override
			public void move() {
				System.out.println("Unit is moving");
			}
		};

		animal.eat();
		unit.move();
	}


}

abstract class Animal {
	abstract void eat();
}

interface Unit {
	void move();
}

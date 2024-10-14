package Anonymous;

public class Restriction {

	public static void main(String[] args) {
		Person person = new Person() {
			@Override
			public void eat() {
				System.out.println("Anonymous Person is eating");
				walk();
			}

			public void walk() {
				System.out.println("Anonymous Person is walking");
			}
		};

		Person person1 = new Korean();

		person.eat();
		// person.walk(); //컴파일 에러
	}
}

class Person {
	public void eat() {
		System.out.println("Person is eating");
	}
}

class Korean extends Person {
	@Override
	public void eat() {
		System.out.println("Korean is eating");
	}

	public void walk() {
		System.out.println("Korean is walking");
	}
}

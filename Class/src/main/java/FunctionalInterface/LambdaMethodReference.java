package FunctionalInterface;

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

@FunctionalInterface
interface PersonFactory {
	Person create(int age, String name);
}

@FunctionalInterface
interface DoSomething {
	void doSomething();
}

class Person {
	private final int age;
	private final String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

class AppleBasket {
	int applePrice;
	int appleCount;

	public AppleBasket(int applePrice, int appleCount) {
		this.applePrice = applePrice;
		this.appleCount = appleCount;
	}

	public void printBasketPrice() {
		System.out.println(applePrice * appleCount);
	}
}

public class LambdaMethodReference {
	public static void main(String[] args) {
		// Lambda
		Calculator calculator = (a, b) -> a + b;
		System.out.println(calculator.calculate(1, 2));

		// Method Reference
		Calculator calculator2 = Integer::sum;
		System.out.println(calculator2.calculate(1, 2));

		// Lambda
		PersonFactory personFactory = (age, name) -> new Person(age, name);
		Person john = personFactory.create(20, "John");

		// Method Reference
		PersonFactory personFactory2 = Person::new;
		Person john2 = personFactory2.create(20, "John");

		AppleBasket appleBasket = new AppleBasket(10, 5);
		// Lambda
		DoSomething runnable = () -> appleBasket.printBasketPrice();
		runnable.doSomething();

		// Method Reference
		DoSomething runnable2 = appleBasket::printBasketPrice;
		runnable2.doSomething();
	}

}

package Generic;

public class Classes {
}

class Food {
	public void print() {
		System.out.println("Food");
	}
}

class Fruit extends Food {
	@Override
	public void print() {
		System.out.println("Fruit");
	}
}

class Burger extends Food {
	@Override
	public void print() {
		System.out.println("Burger");
	}

	public void burgerMethod() {
		System.out.println("Burger Method");
	}
}

class CheeseBurger extends Burger {
	@Override
	public void print() {
		System.out.println("CheeseBurger");
	}

	public void cheeseBurgerMethod() {
		System.out.println("CheeseBurger Method");
	}
}

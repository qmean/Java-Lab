package WildCard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Printer {
	static void print(List<? extends Food> list){
		for (Food food : list) {
			food.print();
		}
	}
}

class BurgerAdder {
	static void addBurger(List<Burger> list) {
		list.add(new Burger());
		list.add(new CheeseBurger());
	}
}

public class Main {
	public static void main(String[] args) {
		List<Food> foods = List.of(new Fruit(), new Burger(), new CheeseBurger());
		List<Burger> burgers = List.of(new Burger(), new CheeseBurger());
		Printer.print(foods);
		Printer.print(burgers);

		List<Burger> burgerList = new ArrayList<>();
		BurgerAdder.addBurger(burgerList);

		FoodWrapper<? extends Food> fruitFoodWrapper = new FoodWrapper<>(new Fruit());
		FoodWrapper<? extends Food> burgerFoodWrapper = new FoodWrapper<>(new Burger());

		fruitFoodWrapper = burgerFoodWrapper;
	}
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

class FoodWrapper<T extends Food> {
	T t;

	public FoodWrapper(T t) {
		this.t = t;
	}

	public void print() {
		t.print();
	}
}

class Cart<T> {
	Object[] items = new Object[10];
	int size = 0;

	public Cart(List<T> collection) {
		for (T t : collection) {
			items[size++] = t;
		}
	}

	public Cart() {}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(items[i]);
		}
	}

	public void add(T t) {
		items[size++] = t;
	}

	public void addAll(Collection<T> collection) {
		for (T t : collection) {
			items[size++] = t;
		}
	}
}

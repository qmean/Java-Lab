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

class Adder {
	static void add(List<?> list) {
		// list.add(new Fruit()); // -> 컴파일오류
	}
}

class FoodAdder {
	Object[] items = new Object[10];
	int size = 0;

	public FoodAdder(List<Food> foods) {
		for (Food food : foods) {
			items[size++] = food;
		}
	}

	public void copyFoods(List<Food> list) {
		for (int i = 0; i < size; i++) {
			list.add((Food)items[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Food food = new Food();
		Object object = food;
		List<Food> foods = List.of(new Food(), new Fruit(), new Burger(), new CheeseBurger());

		FoodAdder foodAdder = new FoodAdder(foods);
		List<Food> foodList = new ArrayList<>();
		List<Object> objectList = new ArrayList<>();
		List<Burger> burgerList = new ArrayList<>();
		List<CheeseBurger> cheeseBurgerList = new ArrayList<>();
		foodAdder.copyFoods(foodList);
		// foodAdder.copyFoods(objectList);
		// foodAdder.copyFoods(burgerList);
		// foodAdder.copyFoods(cheeseBurgerList);

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

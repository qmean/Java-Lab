package Generic;

public class Main {
	public static void main(String[] args) {
		String string = "문자열입니다";
		Shop<Food> shop = new Shop<>(new Burger());
		shop.print();
		Object obj = new Object();
	}
}

class Shop<T extends Food> {
	T t;

	public Shop(T t) {
		this.t = t;
	}

	public void print() {
		t.print();
	}
}

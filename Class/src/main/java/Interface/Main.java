package Interface;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new MyCalculator();
		System.out.println(calculator.add(5, 3));
		System.out.println(calculator.subtract(5, 3));
		System.out.println(calculator.multiply(5, 3));
		System.out.println(calculator.divide(5, 3));
	}
}

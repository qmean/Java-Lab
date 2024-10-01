package Overloading;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print(10);
		printer.print(10L);
		printer.print("Hello");
	}
}

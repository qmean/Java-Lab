package Wrapper;

import java.util.Objects;

public class WrapperMain {

	public static void main(String[] args) {
		int value = 10;
		MyIntegerWrapper integerWrapper = new MyIntegerWrapper(value);
		print(integerWrapper);
	}

	public static void add(Integer original) {
		Integer copy = original;
		System.out.println("(copy == original) = " + (Objects.equals(copy, original)));

		original+=10;
		System.out.println("(copy == original) = " + (Objects.equals(copy, original)));
		copy = original;
	}

	public static <T> void print(T value) {
		System.out.println(value);
	}
}

class MyIntegerWrapper {
	int value;

	public MyIntegerWrapper(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

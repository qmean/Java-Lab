package Wrapper;

public class WrapperWarning {

	public static void main(String[] args) {
		Integer value = 10;
		System.out.println("value = " + value);
		add(value);
		System.out.println("value after add = " + value);
	}

	public static void  add(Integer original) {
		original+=10;
	}
}

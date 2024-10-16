package Reflection;

import java.lang.reflect.Field;

public class SetField {

	public static void main(String[] args) {
		TestClass testClass = new TestClass("defaultField");
		TestInterface testInterface = new TestClass("defaultField");

		Class<? extends TestClass> testClassClass = testClass.getClass();
		Class<? extends TestInterface> testInterfaceClass = testInterface.getClass();

		/**
		 * Class 객체에서 필드를 가져온 후 값을 설정하는 방법
		 * 1. Class 객체의 getField() 메소드를 사용하여 public 필드를 가져온 후 값을 설정
		 * 2. Class 객체의 getDeclaredField() 메소드를 사용하여 private 필드를 가져온 후 값을 설정
		 * 4. Field 객체의 setAccessible() 메소드를 사용하여 private 필드에 접근 가능하게 설정
		 * 3. Field 객체의 set() 메소드를 사용하여 값을 설정
		 */

		// getField 메서드로 public 필드를 가져온 후 값을 설정
		try {
			Field publicField = testClassClass.getField("publicField");
			publicField.set(testClass, "publicField");
			System.out.println("publicField 에 값을 설정했습니다. 설정 후 값 : " + publicField.get(testClass));
		} catch (NoSuchFieldException e) {
			System.out.println("publicField 를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("publicField 에 접근할 수 없습니다.");
		}

		// getDeclaredField 메서드로 private 필드를 가져온 후 값을 설정 (setAccessible() 메서드 적용하지 않을 시)
		try {
			Field privateField = testClassClass.getDeclaredField("privateField");
			privateField.set(testClass, "privateField");
			System.out.println("privateField 에 값을 설정했습니다. 설정 후 값 : " + privateField.get(testClass));
		} catch (NoSuchFieldException e) {
			System.out.println("privateField 를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("privateField 에 접근할 수 없습니다.");
		}

		// getDeclaredField 메서드로 private 필드를 가져온 후 값을 설정 (setAccessible() 메서드 적용)
		try {
			Field privateField = testClassClass.getDeclaredField("privateField");
			privateField.setAccessible(true);
			privateField.set(testClass, "privateField");
			System.out.println("privateField 에 값을 설정했습니다. 설정 후 값 : " + testClass.getPrivateField());
		} catch (NoSuchFieldException e) {
			System.out.println("privateField 를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("privateField 에 접근할 수 없습니다.");
		}
	}
}

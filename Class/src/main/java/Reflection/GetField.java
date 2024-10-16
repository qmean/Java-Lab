package Reflection;

import java.lang.reflect.Field;

public class GetField {

	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		TestInterface testInterface = new TestClass();

		Class<? extends TestClass> testClassClass = testClass.getClass();
		Class<? extends TestInterface> testInterfaceClass = testInterface.getClass();

		/**
		 * Class 객체에서 필드를 가져오는 방법
		 * 하나씩 가져오기
		 * 1. getField() 메소드를 사용한다.(public 필드만 가져올 수 있다.)
		 * 2. getDeclaredField() 메소드를 사용한다.(모든 필드를 가져올 수 있다.)
		 * 두 개의 메서드 다 이름에 해당하는 필드가 없으면 NoSuchFieldException 이 발생한다.
		 *
		 * 한번에 전부 가져오기
		 * 1. getFields() 메소드를 사용한다.(public 필드만 가져올 수 있다.)
		 * 2. getDeclaredFields() 메소드를 사용한다.(모든 필드를 가져올 수 있다.)
		 * Exception 이 발생하지 않는다.
		 */

		// getField 메서드로 필드를 가져옴 (public)
		System.out.println("===== getField() 메서드로 public 필드를 가져옴 =====");
		try {
			Field testClassClassField = testClassClass.getField("publicField");
			Field testInterfaceClassField = testInterfaceClass.getField("publicField");
			System.out.println("public 필드를 가져오는데 성공했습니다.");
		} catch (NoSuchFieldException e) {
			System.out.println("public 필드를 가져오는데 실패했습니다.");
		}

		// getField 메서드로 필드를 가져옴 (private)
		System.out.println("===== getField() 메서드로 private 필드를 가져옴 =====");
		try {
			Field testClassClassField = testClassClass.getField("privateField");
			Field testInterfaceClassField = testInterfaceClass.getField("privateField");
		} catch (NoSuchFieldException e) {
			System.out.println("private 필드를 가져오는데 실패했습니다.");
		}

		// getDeclaredField 메서드로 필드를 가져옴 (public)
		System.out.println("===== getDeclaredField() 메서드로 public 필드를 가져옴 =====");
		try {
			Field testClassClassField = testClassClass.getDeclaredField("publicField");
			Field testInterfaceClassField = testInterfaceClass.getDeclaredField("publicField");
			System.out.println("public 필드를 가져오는데 성공했습니다.");
		} catch (NoSuchFieldException e) {
			System.out.println("public 필드를 가져오는데 실패했습니다.");
		}

		// getDeclaredField 메서드로 필드를 가져옴 (private)
		System.out.println("===== getDeclaredField() 메서드로 private 필드를 가져옴 =====");
		try {
			Field testClassClassField = testClassClass.getDeclaredField("privateField");
			Field testInterfaceClassField = testInterfaceClass.getDeclaredField("privateField");
			System.out.println("private 필드를 가져오는데 성공했습니다.");
		} catch (NoSuchFieldException e) {
			System.out.println("private 필드를 가져오는데 실패했습니다.");
		}

		// getFields 메서드로 모든 필드를 가져옴 (public)
		System.out.println("===== getFields() 메서드로 모든 필드를 가져옴 =====");
		Field[] testClassClassFields = testClassClass.getFields();
		System.out.println("TestClass 클래스의 필드");
		for (Field field : testClassClassFields) {
			System.out.println(field.getName());
		}
		Field[] testInterfaceClassFields = testInterfaceClass.getFields();
		System.out.println("TestInterface 클래스의 필드");
		for (Field field : testInterfaceClassFields) {
			System.out.println(field.getName());
		}

		// getDeclaredFields 메서드로 모든 필드를 가져옴 (모든 접근제어자)
		System.out.println("===== getDeclaredFields() 메서드로 모든 필드를 가져옴 =====");
		Field[] testClassClassDeclaredFields = testClassClass.getDeclaredFields();
		System.out.println("TestClass 클래스의 필드");
		for (Field field : testClassClassDeclaredFields) {
			System.out.println(field.getName());
		}
		Field[] testInterfaceClassDeclaredFields = testInterfaceClass.getDeclaredFields();
		System.out.println("TestInterface 클래스의 필드");
		for (Field field : testInterfaceClassDeclaredFields) {
			System.out.println(field.getName());
		}
	}
}

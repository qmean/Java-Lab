package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethod {

	public static void main(String[] args) {
		Class<TestClass> testClass = TestClass.class;
		TestClass testInstance = new TestClass();

		/**
		 * Method 객체에서 메서드를 실행하는 방법
		 * 1. Public 메서드의 경우 Method 객체의 invoke() 메서드를 사용하여 실행
		 * 2. Private 메서드의 경우 Method 객체의 setAccessible() 메서드를 사용하여 접근 가능하게 만든 후 invoke() 메서드를 사용하여 실행
		 * 3. static 메서드의 경우 Method 객체의 invoke() 메서드를 사용하여 실행 (인스턴스를 파라미터로 넘기지 않음)
		 */

		// public 메서드 실행
		try {
			System.out.println("publicMethod 메서드 실행 시도");
			Method publicMethod = testClass.getMethod("publicMethod");
			publicMethod.invoke(testInstance);
			System.out.println("publicMethod 메서드 실행 성공");
		} catch (NoSuchMethodException e) {
			System.out.println("publicMethod 메서드를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("publicMethod 메서드에 접근할 수 없습니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("publicMethod 메서드에 잘못된 인자를 전달하였습니다.");
		} catch (InvocationTargetException e) {
			System.out.println("publicMethod 메서드를 실행하는 target 이 잘못되었습니다.");
		}

		// private 메서드 실행 (setAccessible() 메서드 호출 없이 실행 시도)
		try {
			System.out.println("privateMethod 메서드 실행 시도");
			Method privateMethod = testClass.getDeclaredMethod("privateMethod");
			privateMethod.invoke(testInstance);
			System.out.println("privateMethod 메서드 실행 성공");
		} catch (NoSuchMethodException e) {
			System.out.println("privateMethod 메서드를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("privateMethod 메서드에 접근할 수 없습니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("privateMethod 메서드에 잘못된 인자를 전달하였습니다.");
		} catch (InvocationTargetException e) {
			System.out.println("privateMethod 메서드를 실행하는 target 이 잘못되었습니다.");
		}

		// private 메서드 실행 (setAccessible() 메서드 호출 후 실행 시도)
		try {
			System.out.println("privateMethod 메서드 실행 시도");
			Method privateMethod = testClass.getDeclaredMethod("privateMethod");
			privateMethod.setAccessible(true);
			privateMethod.invoke(testInstance);
			System.out.println("privateMethod 메서드 실행 성공");
		} catch (NoSuchMethodException e) {
			System.out.println("privateMethod 메서드를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("privateMethod 메서드에 접근할 수 없습니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("privateMethod 메서드에 잘못된 인자를 전달하였습니다.");
		} catch (InvocationTargetException e) {
			System.out.println("privateMethod 메서드를 실행하는 target 이 잘못되었습니다.");
		}

		// public static 메서드 실행
		try {
			System.out.println("publicStaticMethod 메서드 실행 시도");
			Method staticMethod = testClass.getMethod("publicStaticMethod");
			staticMethod.invoke(null);
			System.out.println("publicStaticMethod 메서드 실행 성공");
		} catch (NoSuchMethodException e) {
			System.out.println("publicStaticMethod 메서드를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("publicStaticMethod 메서드에 접근할 수 없습니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("publicStaticMethod 메서드에 잘못된 인자를 전달하였습니다.");
		} catch (InvocationTargetException e) {
			System.out.println("publicStaticMethod 메서드를 실행하는 target 이 잘못되었습니다.");
		}

		// private static 메서드 실행 (setAccessible() 메서드 호출 없이 실행 시도)
		try {
			System.out.println("privateStaticMethod 메서드 실행 시도");
			Method staticMethod = testClass.getDeclaredMethod("privateStaticMethod");
			staticMethod.invoke(null);
		} catch (NoSuchMethodException e) {
			System.out.println("staticMethod 메서드를 찾을 수 없습니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("staticMethod 메서드에 잘못된 인자를 전달하였습니다.");
		} catch (InvocationTargetException e) {
			System.out.println("staticMethod 메서드를 실행하는 target 이 잘못되었습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("staticMethod 메서드에 접근할 수 없습니다.");
		}

		// private static 메서드 실행 (setAccessible() 메서드 호출 후 실행 시도)
		try {
			System.out.println("privateStaticMethod 메서드 실행 시도");
			Method staticMethod = testClass.getDeclaredMethod("privateStaticMethod");
			staticMethod.setAccessible(true);
			staticMethod.invoke(null);
			System.out.println("staticMethod 메서드 실행 성공");
		} catch (NoSuchMethodException e) {
			System.out.println("staticMethod 메서드를 찾을 수 없습니다.");
		} catch (IllegalAccessException e) {
			System.out.println("staticMethod 메서드에 접근할 수 없습니다.");
		} catch (IllegalArgumentException e) {
			System.out.println("staticMethod 메서드에 잘못된 인자를 전달하였습니다.");
		} catch (InvocationTargetException e) {
			System.out.println("staticMethod 메서드를 실행하는 target 이 잘못되었습니다.");
		}
	}
}

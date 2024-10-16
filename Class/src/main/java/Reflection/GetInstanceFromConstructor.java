package Reflection;

import java.lang.reflect.Constructor;

public class GetInstanceFromConstructor {

	public static void main(String[] args) {
		Class<TestClass> testClassClass = TestClass.class;

		/**
		 * Constructor 객체를 사용하여 인스턴스 생성하는 방법
		 * 1. Constructor 객체의 newInstance() 메소드를 사용하여 인스턴스 생성
		 * 2. Constructor 객체의 setAccessible() 메소드를 사용하여 private 생성자 접근 가능하게 만든 후 newInstance() 메소드를 사용하여 인스턴스 생성
		 */

		// public 생성자를 사용하여 인스턴스 생성
		try {
			System.out.println("public 생성자를 사용하여 인스턴스 생성 시도");
			Constructor<TestClass> testClass = testClassClass.getConstructor();
			TestClass testInstance = testClass.newInstance();
			System.out.println("public 생성자를 사용하여 인스턴스 생성 성공 testInstance: " + testInstance);
		} catch (NoSuchMethodException e) {
			System.out.println("public 생성자를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("public 생성자를 사용하여 인스턴스 생성 실패");
		}

		// private 생성자를 사용하여 인스턴스 생성 (setAccessible() 메서드 호출 없이 생성 시도)
		try {
			System.out.println("private 생성자를 사용하여 인스턴스 생성 시도 (setAccessible() 메서드 호출 없이)");
			Constructor<TestClass> testClass = testClassClass.getDeclaredConstructor(String.class, String.class, String.class);
			TestClass testInstance = testClass.newInstance("test", "test", "test");
			System.out.println("private 생성자를 사용하여 인스턴스 생성 성공 testInstance: " + testInstance);
		} catch (NoSuchMethodException e) {
			System.out.println("private 생성자를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("private 생성자를 사용하여 인스턴스 생성 실패");
		}

		// private 생성자를 사용하여 인스턴스 생성 (setAccessible() 메서드 호출 후 생성 시도)
		try {
			System.out.println("private 생성자를 사용하여 인스턴스 생성 시도 (setAccessible() 메서드 호출 후)");
			Constructor<TestClass> testClass = testClassClass.getDeclaredConstructor(String.class, String.class, String.class);
			testClass.setAccessible(true);
			TestClass testInstance = testClass.newInstance("test", "test", "test");
			System.out.println("private 생성자를 사용하여 인스턴스 생성 성공 testInstance: " + testInstance);
		} catch (NoSuchMethodException e) {
			System.out.println("private 생성자를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("private 생성자를 사용하여 인스턴스 생성 실패");
		}
	}
}

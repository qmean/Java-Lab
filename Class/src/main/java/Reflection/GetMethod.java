package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod {

	/**
	 * Method 객체를 얻는방법
	 * 1. getMethod() 메소드를 사용하는 방법 (public 메소드만 포함)
	 * 2. getMethods() 메소드를 사용하는 방법 (public 메소드만 포함)
	 * 3. getDeclaredMethod() 메소드를 사용하는 방법 (모든 접근제어자 메소드 포함)
	 * 4. getDeclaredMethods() 메소드를 사용하는 방법 (모든 접근제어자 메소드 포함)
	 */
	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		TestInterface testInterface = new TestClass();

		Class<? extends TestClass> testClassClass = testClass.getClass();
		Class<? extends TestInterface> testInterfaceClass = testInterface.getClass();

		// getMethod 메서드 사용하여 public 메소드 획득

		try {
			System.out.println("Try To Find Method");
			testClassClass.getMethod("publicMethod");
			testInterfaceClass.getMethod("hello");
			System.out.println("Method Found");
		} catch (NoSuchMethodException e) {
			System.out.println("Method Not Found");
		}

		// TestInterface 에서 publicMethod 추출 시도
		// 인터페이스에서 인터페이스 구현체의 메소드 추출 가능
		try {
			testInterfaceClass.getMethod("publicMethod");
			System.out.println("Interface Implement Method Found");
		} catch (NoSuchMethodException e) {
			System.out.println("Interface Implement Method Not Found");
		}

		// getMethods 메서드 사용하여 메서드 전부 획득
		Method[] methods = testClassClass.getMethods();
		System.out.println("===== Methods Found By GetMethods - Class");
		System.out.println("Found Methods Are:");
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("===== End Of Methods - Class");

		// getMethods 메서드 사용하여 인터페이스 구현체의 메서드 전부 획득
		Method[] methods2 = testInterfaceClass.getMethods();
		System.out.println("===== Methods Found By GetMethods - Interface");
		System.out.println("Found Methods Are:");
		for (Method method : methods2) {
			System.out.println(method.getName());
		}
		System.out.println("===== End Of Methods - Interface");

		// getDeclaredMethod 메서드 사용하여 private 메소드 획득
		try {
			testClassClass.getDeclaredMethod("privateMethod");
			System.out.println("Private Method Found");
		} catch (NoSuchMethodException e) {
			System.out.println("Private Method Not Found");
		}

		// getDeclaredMethods 메서드 사용하여 메서드 전부 획득
		Method[] declaredMethods = testClassClass.getDeclaredMethods();
		System.out.println("===== Methods Found By GetDeclaredMethods");
		System.out.println("Found Methods Are:");
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		System.out.println("===== End Of Methods -> Class");

		// getDeclaredMethod 메서드 사용하여 인터페이스의 구현체 메서드 전부 획득
		Method[] declaredMethods2 = testInterfaceClass.getDeclaredMethods();
		System.out.println("===== Methods Found By GetDeclaredMethods");
		System.out.println("Found Methods Are:");
		for (Method method : declaredMethods2) {
			System.out.println(method.getName());
		}
		System.out.println("===== End Of Methods -> Interface");

		// public method invoke
		try {
			Method publicMethod = testClassClass.getMethod("publicMethod");
			publicMethod.invoke(testClass);
		} catch (NoSuchMethodException e) {
			System.out.println("Public Method Not Found");
		} catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException e) {
			System.out.println("Public Method Invoke Failed");
		}

		// private method invoke
		try {
			Method privateMethod = testClassClass.getDeclaredMethod("privateMethod");
			privateMethod.setAccessible(true);
			privateMethod.invoke(testClass);
		} catch (Exception e) {
			System.out.println("Private Method Invoke Failed");
		}

		// static method invoke
		try {
			Method staticMethod = testClassClass.getMethod("publicStaticMethod");
			staticMethod.invoke(null);
		} catch (Exception e) {
			System.out.println("Static Method Invoke Failed");
		}
	}
}

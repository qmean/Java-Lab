package Reflection;

import java.lang.reflect.Constructor;

public class GetConstructor {

	public static void main(String[] args) throws Exception{
		TestClass testClass = new TestClass();
		TestInterface testInterface = new TestClass();

		Class<? extends TestClass> testClassClass = testClass.getClass();
		Class<? extends TestInterface> testInterfaceClass = testInterface.getClass();

		/**
		 * Constructor 객체를 얻는 방법
		 * 1. Class 객체의 getConstructor() 메소드를 사용하는 방법 (public 생성자만 포함)
		 * 3. Class 객체의 getConstructors() 메소드를 사용하는 방법 (public 생성자만 포함)
		 * 2. Class 객체의 getDeclaredConstructor() 메소드를 사용하는 방법 (private 생성자 포함)
		 * 4. Class 객체의 getDeclaredConstructors() 메소드를 사용하는 방법 (private 생성자 포함)
		 * 만약 해당 생성자가 없을 경우 NoSuchMethodException 발생
		 */

		// getConstructor 메서드 사용하여 public 생성자 획득
		try {
			// TestClass 객체가 아니라 하위 객체일 수도 있기 때문에 와일드카드 사용
			Constructor<? extends TestClass> constructor = testClassClass.getConstructor();
			Constructor<? extends TestClass> inputConstructor = testClassClass.getConstructor(String.class);
			Constructor<? extends TestInterface> testInterfaceConstructor = testInterfaceClass.getConstructor();
			Constructor<? extends TestInterface> constructor3 = testInterfaceClass.getConstructor(String.class);
		} catch (NoSuchMethodException e) {
			System.out.println("NoSuchMethod In getConstructor()");
		}

		// getConstructors 메서드 사용하여 private 생성자 획득 시도
		try {
			System.out.println("private 생성자 획득 시도");
			testClassClass.getConstructor(String.class, String.class, String.class);
			System.out.println("private 생성자 획득 성공");
		} catch (NoSuchMethodException e) {
			System.out.println(
				"NoSuchMethod In testClassClass.getConstructor(String.class, String.class, String.class)");
			System.out.println("private 생성자 획득 실패");
		}

		// getDeclaredConstructor 메서드 사용하여 private 생성자까지 획득 가능
		try {
			System.out.println("public 생성자 획득 시도");
			Constructor<? extends TestClass> declaredConstructor1 = testClassClass.getDeclaredConstructor();
			System.out.println("public 생성자 획득 성공");

			System.out.println("private 생성자 획득 시도");
			Constructor<? extends TestClass> declaredConstructor2 = testClassClass.getDeclaredConstructor(String.class,
				String.class, String.class);
			System.out.println("private 생성자 획득 성공");
		} catch (NoSuchMethodException e) {
			System.out.println("생성자 획득 실패");
			System.out.println("NoSuchMethod In getDeclaredConstructor()");
			e.printStackTrace();
		}
	}
}


package Reflection;

public class GetClass {

	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		TestInterface testInterface = new TestClass();

		/**
		 * Class 객체를 얻는 방법
		 * 1. 클래스 리터럴을 사용하는 방법 (TestClass.class)
		 * 2. Object의 getClass() 메소드를 사용하는 방법 (testClass.getClass())
		 * 3. Class.forName() 메소드를 사용하는 방법 (Class.forName("Reflection.TestClass"))
		 */

		// 리터럴을 사용하는 방법 -> 해당 클래스의 클래스 객체를 확실하게 얻을 수 있음
		Class<TestClass> testClassClass = TestClass.class;

		// getClass() 메소드를 사용하는 방법 -> 하위 객체의 인스턴스일수도 있기 때문에 와일드카드 사용
		Class<? extends TestClass> testClassClass2 = testClass.getClass();
		Class<? extends TestInterface> testInterfaceClass = testInterface.getClass();

		// Class.forName() 메소드를 사용하는 방법
		// -> 클래스 이름을 사용하기 때문에 오타가 있을 경우 Exception 발생
		// -> 어떤 타입의 클래스인지 알 수 없기 때문에 와일드카드 사용
		try {
			Class<?> aClass = Class.forName("Reflection.TestClass");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound In Class.forName(\"Reflection.TestClass\")");
		}
	}
}

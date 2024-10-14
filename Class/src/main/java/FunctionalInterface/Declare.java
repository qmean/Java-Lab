package FunctionalInterface;

public class Declare {

	public static void main(String[] args) {
		TestFunction testFunction = new TestFunctionImpl();
		TestClass testClass = new TestClass(testFunction);

		TestClass testClass2 = new TestClass(new TestFunction() {
			@Override
			public void testMethod() {
				System.out.println("Anonymous TestFunction");
			}
		});

		TestClass testClass3 = new TestClass(() -> System.out.println("Lambda TestFunction"));

		testClass.test();
		testClass2.test();
		testClass3.test();
	}
}

class TestFunctionImpl implements  TestFunction {
	@Override
	public void testMethod() {
		System.out.println("TestFunctionImpl");
	}
}

@FunctionalInterface
interface TestFunction {
	void testMethod();
}

class TestClass {
	private final TestFunction testFunction;

	public TestClass(TestFunction testFunction) {
		this.testFunction = testFunction;
	}

	public void test() {
		testFunction.testMethod();
	}
}

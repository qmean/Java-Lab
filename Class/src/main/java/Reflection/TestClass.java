package Reflection;

@TestAnnotation("TestClass")
@InheritedAnnotation
class TestClass implements TestInterface {
	String defaultField;
	private String privateField;
	public String publicField;

	public TestClass() {
		defaultField = "defaultField";
		privateField = "privateField";
		publicField = "publicField";
	}

	public TestClass(String input) {
		defaultField = input;
		privateField = input;
		publicField = input;
	}

	private TestClass(String defaultField, String privateField, String publicField) {
		this.defaultField = defaultField;
		this.privateField = privateField;
		this.publicField = publicField;
	}

	private void privateMethod() {
		System.out.println("privateMethod");
	}

	public void publicMethod() {
		System.out.println("publicMethod");
	}

	void defaultMethod() {
		System.out.println("defaultMethod");
	}

	static void defaultStaticMethod() {
		System.out.println("defaultStaticMethod");
	}

	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}

	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}

	@Override
	public void hello() {
		System.out.println("hello");
	}

	public String getPrivateField() {
		return privateField;
	}
}

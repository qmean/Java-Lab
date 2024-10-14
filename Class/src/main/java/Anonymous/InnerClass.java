package Anonymous;

public class InnerClass {


}

class Outer {
	Integer field = 10;

	Inner inner = new Inner() {
		@Override
		public void innerMethod() {
			System.out.println("field: " + field);
		}
	};

	void outerMethod() {
		inner.innerMethod();
	}
}

interface Inner {
	void innerMethod();
}

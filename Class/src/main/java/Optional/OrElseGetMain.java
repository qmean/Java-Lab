package Optional;

import java.util.Optional;

public class OrElseGetMain {

	public static void main(String[] args) {
		Child child = new Child();

		Optional<Child> optionalChild = Optional.ofNullable(child);

		Child newChild = optionalChild.orElseGet(() -> new GrandChild());
	}
}

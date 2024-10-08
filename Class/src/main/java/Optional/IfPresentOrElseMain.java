package Optional;

import java.util.Optional;

public class IfPresentOrElseMain {

	public static void main(String[] args) {
		String nullString = null;
		String notNullString = "Hello, World!";

		Optional<String> nullOptional = Optional.ofNullable(nullString);
		Optional<String> notNullOptional = Optional.of(notNullString);

		nullOptional.ifPresentOrElse((s -> System.out.println(s)),
			() -> System.out.println("nullOptional is empty"));
		notNullOptional.ifPresentOrElse((s -> System.out.println(s)),
			() -> System.out.println("notNullOptional is empty"));
	}
}

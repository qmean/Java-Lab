package Optional;

import java.util.Optional;

public class IfPresentMain {

	public static void main(String[] args) {
		String nullString = null;
		String notNullString = "Hello, World!";

		Optional<String> nullOptional = Optional.ofNullable(nullString);
		Optional<String> notNullOptional = Optional.of(notNullString);

		nullOptional.ifPresent(s -> System.out.println(s));
		notNullOptional.ifPresent(s -> System.out.println(s));
	}
}

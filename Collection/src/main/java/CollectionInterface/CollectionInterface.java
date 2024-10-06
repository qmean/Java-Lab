package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
	public static void main(String[] args) {
		Collection<Integer> values = new ArrayList<>();

		System.out.println("values.add(3) = " + values.add(3));
		System.out.println("values.contains(3) = " + values.contains(3));
		System.out.println("values.contains(5) = " + values.contains(5));
	}
}

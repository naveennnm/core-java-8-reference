package java8.core.methodreference;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naveen
 *
 */
public class MethodReference {
	public static void main(String args[]) {

		List<String> namesList = new ArrayList<>();
		namesList.add("Name One");
		namesList.add("Name Two");
		namesList.add("Name Three");
		namesList.add("Name Four");
		// JAVA 7
		System.out.println("Print All Names JAVA 7");
		for(String string:namesList)
			System.out.println(string);
		// JAVA 8 Print all Using forEach
		System.out.println("Print All Names JAVA 8");
		namesList.forEach(System.out::println);

		// Checking Name is exists
		System.out.println("Checking Name is exists 'Name Two' ");
		namesList.forEach(elem -> {
			if (elem.equals("Name Two"))
				System.out.println(elem);
		});

		// The better, functional way of dealing with this to stream and filter:
		System.out.println("Checking Name is exists 'Name One' using stream");
		String name = namesList.stream().filter(c -> c.equals("Name One")).findAny().map(v -> "Name One").orElse(null);
		System.out.println(name);

	}

}
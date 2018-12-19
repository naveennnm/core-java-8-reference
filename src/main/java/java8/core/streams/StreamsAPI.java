package java8.core.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Naveen
 *
 */
public class StreamsAPI
{
	public static void main(String args[]) {

		List<String> stringsList = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		stringsList.forEach(System.out::println);
		System.out.println("*************************************");
		//Filter isEmpty()
		List<String> filteredList = stringsList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filteredList.forEach(System.out::println);
		System.out.println("*************************************");
		//code segment prints a count of empty strings from 'stringsList'
		int count = (int) stringsList.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		System.out.println("*************************************");
		//code segment prints a non count of empty strings from 'stringsList'
		count = (int) stringsList.stream().filter(string -> !string.isEmpty()).count();
		System.out.println(count);
		System.out.println("*************************************");

	}

}

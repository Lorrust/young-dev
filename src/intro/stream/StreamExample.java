package intro.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

//		Stream turns a collection object into a data flow
		List<String> names = new ArrayList<>();
		names.add("Iris");
		names.add("Fer");
		names.add("Toid");
		names.add("Fer");
		names.add("Tristan");

		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);

		System.out.println("");

		names.stream().filter(name -> name.startsWith("T")).forEach(System.out::println);

		System.out.println("");

		names.stream().distinct().forEach(System.out::println);

		System.out.println("");
		
		System.out.println(convertString("Example"));
		
		System.out.println("");
		
		System.out.println(names.stream().filter(Objects::nonNull).mapToInt(String::length).average());
		
		System.out.println("");
		
		Map<Integer, List<String>> result = names.stream().map(String::toUpperCase).collect(Collectors.groupingBy(null));
		
		System.out.println(result);
		
	}

	private static String convertString(String s) {
		System.out.println("Entered the convertString method.");
		return s.toUpperCase();

	}

}
 joa was here
package intro.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
//		Java HashMaps are analogous to Python dictionaries
		
		Map<Integer, String> people = new HashMap<>();
		people.put(1, "Mary");
		people.put(2, "Pilgrim");
		System.out.println(people.size());
		System.out.println(people.get(1));
		people.remove(1);
		System.out.println(people.get(1));
		people.put(1, "Vann");
		System.out.println(people.get(1));

	}

}

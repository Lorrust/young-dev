package basic.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
	
	public static void main(String[] args) {
	
	HashMap<Integer, String> people = new HashMap<Integer, String>();
	
	people.put(1, "Eren");
	people.put(2, "Sasha");
	people.put(3, "Mikasa");
	people.put(4, "Levi");
	
	System.out.println("Map Iteration");
	
	for (Map.Entry<Integer, String> person : people.entrySet()) {
		System.out.println(person.getValue());
	}

	}

}

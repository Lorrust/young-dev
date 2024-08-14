package basic.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
//		HashSets are unordered lists with unique values
		
		Set<String> collection = new HashSet<>();
		collection.add("Test");
		System.out.println(collection.size());
		collection.add("Example");
		System.out.println(collection.size());
		collection.add("Test");
		System.out.println(collection.size());
		
	}

}

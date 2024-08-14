package basic.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercise3 {

	public static void main(String[] args) {

		Random r = new Random();

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));
		numbers.add(r.nextInt(20));

		Set<Integer> hashNumbers = new HashSet<>();
		hashNumbers.addAll(numbers);

		System.out.println(numbers);
		System.out.println(hashNumbers);

	}

}

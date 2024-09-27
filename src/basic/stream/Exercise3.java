package basic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {

		Random r = new Random();

		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			numbers.add(r.nextInt(100));
		}

		System.out.println(numbers.stream().filter(number -> number == 25).count());

	}

}
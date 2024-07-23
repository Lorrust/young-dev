package intro.arrays;

import java.util.Random;

public class MonthArray {

	public static void main(String[] args) {

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		for (String m: months) {
			System.out.println(m);
		}

		System.out.println("\nRandom Month: " + months[new Random().nextInt(11)]);
		
	}

}

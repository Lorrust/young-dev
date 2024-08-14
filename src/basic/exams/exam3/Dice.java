package basic.exams.exam3;

import java.util.Random;

public class Dice {

	Random r = new Random();

	public int roll() {
		return r.nextInt(1, 7);
	}

}
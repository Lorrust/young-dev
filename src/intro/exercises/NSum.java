package intro.exercises;

import javax.swing.JOptionPane;

public class NSum {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
		}

		JOptionPane.showMessageDialog(null, "The sum of 1+2+3...+10 is " + sum + ".");

	}

}

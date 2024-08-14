package basic.exercises;

import javax.swing.JOptionPane;

public class CompoundSum {

	public static void main(String[] args) {

		int result = 0;

		for (int i = 1; i < 101; i++) {
//			System.out.println(i);
//			System.out.println(i + 1);
			result += i + i + 1;
//			System.out.println(result);
		}

		JOptionPane.showMessageDialog(null, result);

	}

}
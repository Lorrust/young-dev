package basic.arrays;

import javax.swing.JOptionPane;

public class ArrayExample {

	public static void main(String[] args) {

		String[] names = new String[5];
		int counter = 0;

		for (int i = 0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("Name " + (i + 1));
			counter++;
		}

		for (int i = 0; i < counter; i++) {
			System.out.println(names[i]);
		}

		for (String n : names) {
			System.out.println(n);

		}
	}
}
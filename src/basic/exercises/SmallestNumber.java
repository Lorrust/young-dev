package basic.exercises;

import javax.swing.JOptionPane;

public class SmallestNumber {

	public static void main(String[] args) {

		int numberAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of numbers:"));
		double smallest = 100000000;

		for (int i = 0; i < numberAmount; i++) {
			double number = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a number:"));
			if (number < smallest) {
				smallest = number;
			}
		}
		
		JOptionPane.showMessageDialog(null, "The smallest number is " + smallest);
		

	}

}

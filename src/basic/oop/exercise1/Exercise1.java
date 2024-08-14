package basic.oop.exercise1;

import javax.swing.JOptionPane;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		double DoubleNumber = Double.parseDouble(JOptionPane.showInputDialog("Enter a decimal number:"));
		int castNumber = (int) DoubleNumber;
		JOptionPane.showMessageDialog(null, "Double cast to int: " + castNumber);
		
	}

}

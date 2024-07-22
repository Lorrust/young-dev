package intro.repetition_structure.exercises;

import javax.swing.JOptionPane;

public class DivisorSum {
	
	public static void main(String[] args) {
		
		double numAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of numbers:"));
		double result = 0;
		
		for (double i = 1; i < numAmount + 1; i++) {
			result += 1 / i;
		}
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}

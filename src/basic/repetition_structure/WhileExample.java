package basic.repetition_structure;

import javax.swing.JOptionPane;

public class WhileExample {
	
	public static void main(String[] args) {
		
		double balance = Double.parseDouble(JOptionPane.showInputDialog("What is your balance?"));
		double moneySpent = 0;
		
		while (moneySpent <= balance) {
			moneySpent += Double.parseDouble("How much did you spend?");
		}
		JOptionPane.showMessageDialog(null, "You're broke.");
		
	}
}

package basic.exercises;

import javax.swing.JOptionPane;

public class AgeMath {
	
	public static void main(String[] args) {
		
		int ageAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of ages: "));
		int ageSum = 0;
		
		for (int i = 1; i < ageAmount + 1; i++) {
			ageSum += Integer.parseInt(JOptionPane.showInputDialog("Enter the ages " + i + ":"));
		}
		
		JOptionPane.showMessageDialog(null, "The sum of all ages is " + ageSum
										+ "\nThe average age is " + ageSum / ageAmount);
		
	}

}

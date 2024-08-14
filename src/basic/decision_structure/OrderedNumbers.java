package basic.decision_structure;

import javax.swing.JOptionPane;

public class OrderedNumbers {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number:"));
		
		if (num1 <= num2 && num1 <= num3) {
			JOptionPane.showMessageDialog(null, num1);
			if (num2 < num3) {
				JOptionPane.showMessageDialog(null, num2);
				JOptionPane.showMessageDialog(null, num3);
			} else {
				JOptionPane.showMessageDialog(null, num3);
				JOptionPane.showMessageDialog(null, num2);
			}
		}
		
		else if (num2 <= num1 && num2 <= num3) {
			JOptionPane.showMessageDialog(null, num2);
			if (num1 <= num3) {
				JOptionPane.showMessageDialog(null, num1);
				JOptionPane.showMessageDialog(null, num3);
			} else {
				JOptionPane.showMessageDialog(null, num3);
				JOptionPane.showMessageDialog(null, num1);
			}
		}
		
		else if (num3 <= num1 && num3 <= num2) {
			JOptionPane.showMessageDialog(null, num3);
			if (num1 <= num2) {
				JOptionPane.showMessageDialog(null, num1);
				JOptionPane.showMessageDialog(null, num2);
			} else {
				JOptionPane.showMessageDialog(null, num2);
				JOptionPane.showMessageDialog(null, num1);
			}
		}

	}

}

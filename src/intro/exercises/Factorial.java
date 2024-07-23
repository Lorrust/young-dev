package intro.exercises;

import javax.swing.JOptionPane;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the factorial:"));
		int result = 1;
		
		for (int i = num; i > 1; i--) {
			result *= i;
		}
		
		JOptionPane.showMessageDialog(null, num + "!" + " = " + result);
		
	}

}

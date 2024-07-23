package intro.exercises;

import javax.swing.JOptionPane;

public class PowerN {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number:"));
		int pow = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent:"));
		int result = 1;
		
		for (int i = 0; i < pow; i++) {
			result *= num;
		}
		JOptionPane.showMessageDialog(null, num + "^" + pow + " = " + result);
		
	}

}

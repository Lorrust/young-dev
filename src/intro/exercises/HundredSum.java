package intro.exercises;

import javax.swing.JOptionPane;

public class HundredSum {
	
	public static void main(String[] args) {
		
		int result = 0;
		boolean isPositive = true;
		
		for (int i = 1; i < 101; i++) {
			if (isPositive) {
				result += i;
				isPositive = false;
			} else {
				result -= i;
				isPositive = true;
			}
		}
		
		JOptionPane.showMessageDialog(null, "1-2+3-4+5...-100 = " + result);
		
	}

}

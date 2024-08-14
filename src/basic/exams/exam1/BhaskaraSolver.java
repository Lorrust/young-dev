package basic.exams.exam1;

import javax.swing.JOptionPane;

public class BhaskaraSolver {

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of A:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of B:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of C:"));
		
		double x1 = ((- b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a);
		double x2 = ((- b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a);
		
		JOptionPane.showMessageDialog(null, "The values of X are " + x1 + " and " + x2);

	}

}

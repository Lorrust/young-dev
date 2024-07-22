package intro.decision_structure;

import javax.swing.JOptionPane;

public class TriangleVerifier {

	public static void main(String[] args) {

		double sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter the first side of the shape:"));
		double sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter the second side of the shape:"));
		double sideC = Double.parseDouble(JOptionPane.showInputDialog("Enter the third side of the shape:"));

		if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
			if (sideA == sideB && sideB == sideC) {
				JOptionPane.showMessageDialog(null, "It is an equilateral triangle.");
			} else {
				if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC)) {
					JOptionPane.showMessageDialog(null, "It is an isosceles triangle.");
				} else {
					JOptionPane.showMessageDialog(null, "It is a scalene triangle.");
				}
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "It is not a triangle.");
		}
	}
}

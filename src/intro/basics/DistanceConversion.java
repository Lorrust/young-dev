package intro.basics;

import javax.swing.JOptionPane;

public class DistanceConversion {
	
	public static void main(String[] args) {
		
	double feet = Double.parseDouble(JOptionPane.showInputDialog("Enter the distance in feet:"));
	
//	JOptionPane.showMessageDialog(null, feet + " feet is equal to " + String.format("%.2f", feet * 12) + " inches.\n"
//			+ feet + " feet is equal to " + String.format("%.2f", feet / 3) +" yards.\n"
//			+ feet + " feet is equal to " + String.format("%.5f", feet / 3 / 1760) + " miles.");
	
	JOptionPane.showMessageDialog(null, feet + " feet is equal to:\n" + String.format("%.2f", feet * 12) + " inches.\n"
			+ String.format("%.2f", feet / 3) +" yards.\n"
			+ String.format("%.5f", feet / 3 / 1760) + " miles.");
	
	}
}

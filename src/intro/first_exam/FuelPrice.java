package intro.first_exam;

import javax.swing.JOptionPane;

public class FuelPrice {

	public static void main(String[] args) {

		double gasoline = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of one gasoline liter:"));
		double alcohol = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of one alcohol liter:"));

		if (alcohol < gasoline * 0.7) {
			JOptionPane.showMessageDialog(null, "You should refuel with alcohol.");
		} else
			JOptionPane.showMessageDialog(null, "You should refuel with gasoline.");

	}

}

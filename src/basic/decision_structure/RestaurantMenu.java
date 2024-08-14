package basic.decision_structure;

import javax.swing.JOptionPane;

public class RestaurantMenu {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"1 - Cookie\n" + "2 - Bread\n" + "3 - Apple\n" + "4 - Peanut\n" + "5 - Sunflower");

		int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Select a dish:"));

		switch (userChoice) {
		case 1:
			JOptionPane.showMessageDialog(null, "You ate a cookie.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You ate a bread.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You ate an apple.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "You ate a peanut.");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "You ate a sunflower.");
		default:
			JOptionPane.showMessageDialog(null, "That's not a valid option.");
			break;
		}
	}
}

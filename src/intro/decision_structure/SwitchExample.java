package intro.decision_structure;

import javax.swing.JOptionPane;

public class SwitchExample {

	public static void main(String[] args) {

		int period = Integer.parseInt(JOptionPane.showInputDialog("Enter your period (1, 2 or 3):"));

//		if (period == 1) {
//			JOptionPane.showMessageDialog(null, "Morning period.");
//		} else {
//			if (period == 2) {
//				JOptionPane.showMessageDialog(null, "Afternoon period.");
//			} else {
//				if (period == 3) {
//					JOptionPane.showMessageDialog(null, "Evening period.");
//				} else {
//					JOptionPane.showMessageDialog(null, "Invalid period.");
//				}
//			}
//		}
		
		switch (period) {
		case 1:
			JOptionPane.showMessageDialog(null, "Morning period.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Afternoon period.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Evening period.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid period.");
			break;
		}
	}
}

package intro.decision_structure;

import javax.swing.JOptionPane;

public class IfExample {

	public static void main(String[] args) {

		int johnAge = Integer.parseInt(JOptionPane.showInputDialog("Enter John's age:"));
		int maryAge = Integer.parseInt(JOptionPane.showInputDialog("Enter Mary's age:"));

//		Simple If

		if (johnAge > maryAge) {
			JOptionPane.showMessageDialog(null, "John is older than Mary.");
		}
		JOptionPane.showMessageDialog(null, "That's the end.");

//		If-Else

		if (johnAge > maryAge) {
			JOptionPane.showMessageDialog(null, "John is older than Mary.");
		} else {
			JOptionPane.showMessageDialog(null, "Mary is older than John.");
		}
		JOptionPane.showMessageDialog(null, "That's the end.");

//		Chained If

		if (johnAge > maryAge) {
			JOptionPane.showMessageDialog(null, "John is older than Mary.");
		} else if (johnAge == maryAge) {
			JOptionPane.showMessageDialog(null, "John and Mary are the same age.");
		} else {
			JOptionPane.showMessageDialog(null, "Mary is older than John.");
		}
		JOptionPane.showMessageDialog(null, "That's the end.");

	}
}

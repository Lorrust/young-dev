package intro.repetition_structure.exercises;

import javax.swing.JOptionPane;

public class StudentApproval {

	public static void main(String[] args) {

		int studentAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of students:"));

		for (int i = 0; i < studentAmount; i++) {
			String name = JOptionPane.showInputDialog("Enter the student's name:");
			double average = Double.parseDouble(JOptionPane.showInputDialog("Enter the student's average:"));

			if (average >= 7) {
				JOptionPane.showMessageDialog(null, name + " is approved.");
			} else if (average <= 2) {
				JOptionPane.showMessageDialog(null, name + " goes to summer school.");
			} else {
				JOptionPane.showMessageDialog(null, name + " has failed.");
			}
		}

	}

}

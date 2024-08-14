package basic.exercises;

import javax.swing.JOptionPane;

public class YoungOld {

	public static void main(String[] args) {

		int coworkers = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of coworkers:"));

		String youngestName = "";
		int youngestAge = 100;
		String oldestName = "";
		int oldestAge = 0;

		for (int i = 0; i < coworkers; i++) {
			String name = JOptionPane.showInputDialog("Enter the coworker's name:");
			int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the coworker's age:"));

			if (age < youngestAge) {
				youngestAge = age;
				youngestName = name;
			} else if (age > oldestAge) {
				oldestAge = age;
				oldestName = name;
			}
		}

		JOptionPane.showMessageDialog(null, "Youngest coworker: " + youngestName + ", " + youngestAge + " years old.\n"
				+ "Oldest coworker: " + oldestName + ", " + oldestAge + " years old.");

	}

}

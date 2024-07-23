package intro.exercises;

import javax.swing.JOptionPane;

public class StudentData {

	public static void main(String[] args) {

		int studentAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of students:"));

		int newYorkCount = 0;
		int sanFranCount = 0;
		int minorCount = 0;

		for (int i = 1; i < studentAmount + 1; i++) {
			String name = JOptionPane.showInputDialog("Enter the name of student " + i + ":");
			char city = JOptionPane
					.showInputDialog("Enter the city of " + name + ":" + "\nB - Beijing" + "\nS - Shanghai").charAt(0);

			switch (city) {
			case 'B':
				newYorkCount++;
				break;
			case 'S':
				sanFranCount++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid city.");
				break;
			}

			int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of student " + name + ":"));
			if (age < 17) {
				minorCount++;
			}

		}

		JOptionPane.showMessageDialog(null, "Total Students: " + studentAmount + "\nNew York: " + newYorkCount
				+ "\nSan Francisco: " + sanFranCount + "\nMinors: " + minorCount);
	}

}

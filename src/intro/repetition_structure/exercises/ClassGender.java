package intro.repetition_structure.exercises;

import javax.swing.JOptionPane;

public class ClassGender {

	public static void main(String[] args) {

		int students = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of students:"));
		int male = 0;
		int female = 0;

		for (int i = 0; i < students; i++) {
			
			@SuppressWarnings("unused")
			String name = JOptionPane.showInputDialog("Enter the student's name:");
			char gender = JOptionPane.showInputDialog("Enter the student's gender (M or F):").charAt(0);

			switch (gender) {
			case 'M':
				male++;
				break;
			case 'F':
				female++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid option.");

			}
		}
		
		JOptionPane.showMessageDialog(null, "Total: " + students + 
											"\nMale: " + male + 
											"\nFemale: " + female);

	}

}

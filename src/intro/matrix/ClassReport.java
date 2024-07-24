package intro.matrix;

import javax.swing.JOptionPane;

public class ClassReport {

	public static void main(String[] args) {

		String[] names = new String[100];
		double[] exams = new double[100];
		double[][] reports = new double[100][100];

		int row = 0;
		int column = 0;
		int option = 0;

		String menu = "1 - Log Report\n" + "2 - Full Report\n" + "3 - Search by Name\n" + "4 - Approved Students\n"
				+ "5 - Rework Students\n" + "6 - Failed Students\n" + "0 - Exit";

		int examAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of exams:"));

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (option) {

			case 1:
				if (row < 100) {
					String name = JOptionPane.showInputDialog("Enter the student's name:");
					names[row] = name;

					column = 0;
					for (int i = 0; i < examAmount; i++) {
						double grade = Double.parseDouble(JOptionPane
								.showInputDialog("Enter " + names[row] + "'s grade in exam " + (i + 1) + ":"));
						reports[row][column] = grade;
						column++;
					}

					row++;
				}
				break;

//			Full Report
			case 2:
				String msg = "";
				for (int i = 0; i < row; i++) {
					msg += names[i] + ": ";
					double sum = 0;
					for (int j = 0; j < examAmount; j++) {
						sum += reports[i][j];
					}
					msg += (sum / examAmount + "\n");
				}
				JOptionPane.showMessageDialog(null, msg);
				break;

			}

		} while (option != 0);

	}

}

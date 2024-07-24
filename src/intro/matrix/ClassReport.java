package intro.matrix;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ClassReport {

	public static void main(String[] args) {

		String[] names = new String[100];
//		double[] exams = new double[100];
		double[][] reports = new double[100][100];

		int row = 0;
		int column = 0;
		int option = 0;

		DecimalFormat df = new DecimalFormat("#.#");

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
					double avg = 0;
					String condition = "";
					for (int j = 0; j < examAmount; j++) {
						avg += reports[i][j];
					}
					avg /= examAmount;

					if (avg >= 7) {
						condition = "Approved";
					} else if (avg > 3) {
						condition = "Rework";
					} else {
						condition = "Failed";
					}

					msg += (df.format(avg) + " (" + condition + ")\n");
				}
				JOptionPane.showMessageDialog(null, msg);
				break;

//			Search by Name
			case 3:
				String searchName = JOptionPane.showInputDialog("Enter the student's name:");
				String foundName = "Name not found.";
				String condition = "";

				int namePos = 0;

				do {
					String nameReport = "";

					if (names[namePos].equals(searchName)) {
						searchName = names[namePos];
						nameReport = searchName + ": ";
						double avg = 0;

						for (int j = 0; j < examAmount; j++) {
							avg += reports[namePos][j];
						}
						avg /= examAmount;

						if (avg >= 7) {
							condition = "Approved";
						} else if (avg > 3) {
							condition = "Rework";
						} else {
							condition = "Failed";
						}

						nameReport += (df.format(avg) + " (" + condition + ")");

						JOptionPane.showMessageDialog(null, nameReport);
						namePos++;

					}

				} while (namePos < row && foundName.equals("Name not found."));

				break;

//			Approved Students
			case 4:
				String approvedReport = "Approved Students:\n";
				for (int i = 0; i < row; i++) {
					double avg = 0;
					for (int j = 0; j < examAmount; j++) {
						avg += reports[i][j];
					}
					avg /= examAmount;

					if (avg >= 7) {
						approvedReport += names[i] + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, approvedReport);
				break;

//			Rework Students
			case 5:
				String reworkReport = "Rework Students:\n";
				for (int i = 0; i < row; i++) {
					double avg = 0;
					for (int j = 0; j < examAmount; j++) {
						avg += reports[i][j];
					}
					avg /= examAmount;

					if (avg < 7 && avg > 3) {
						reworkReport += names[i] + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, reworkReport);
				break;
				
//			Failed Students
			case 6:
				String failedReport = "Failed Students:\n";
				for (int i = 0; i < row; i++) {
					double avg = 0;
					for (int j = 0; j < examAmount; j++) {
						avg += reports[i][j];
					}
					avg /= examAmount;

					if (avg < 7 && avg > 3) {
						failedReport += names[i] + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, failedReport);
				break;

			}

		} while (option != 0);

	}

}

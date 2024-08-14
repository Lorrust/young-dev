package basic.decision_structure;

import javax.swing.JOptionPane;

public class OldestDate {

	public static void main(String[] args) {

		int day1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the first date:"));
		int month1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the month of the first date:"));
		int year1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of the first date:"));
		String date1 = day1 + "/" + month1 + "/" + year1;

		int day2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the second date:"));
		int month2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the month of the second date:"));
		int year2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the year of the second date:"));
		String date2 = day2 + "/" + month2 + "/" + year2;

		if (year1 < year2) {
			JOptionPane.showMessageDialog(null, date1 + " happened before " + date2 + ".");
			
		} else if (year1 == year2) {
			if (month1 < month2) {
				JOptionPane.showMessageDialog(null, date1 + " happened before " + date2 + ".");
		}
			} else if (month1 == month2) {
				if (day1 < day2) {
					JOptionPane.showMessageDialog(null, date1 + " happened before " + date2 + ".");
				} else {
					JOptionPane.showMessageDialog(null, date2 + " happened before " + date1 + ".");
				}
			}
			 else {
				JOptionPane.showMessageDialog(null, date2 + " happened before " + date1 + ".");
			}
	}
}

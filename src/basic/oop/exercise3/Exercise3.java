package basic.oop.exercise3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate userDate = LocalDate.parse(JOptionPane.showInputDialog("Enter a date (dd/MM/yyyy):"), formatter);
		DayOfWeek weekDay = userDate.getDayOfWeek();
		
		JOptionPane.showMessageDialog(null, weekDay);
		
	}

}

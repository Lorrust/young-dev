package intro.methods;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentReport {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();

		int option;
		
		do {
			option = menu();
			
			switch (option) {
//			Log Student
			case 1:
				logStudent(students);
				break;
//			Full Report
			case 2:
				fullReport(students);
				break;
			}
			
		} while (option != 7);

	}

	public static int menu() {
		String m = "1 - Log Student\n"
				+ "2 - Full Report\n"
				+ "3 - Search by Name\n"
				+ "4 - Show Approved\n"
				+ "5 - Show Rework\n"
				+ "6 - Show Failed\n"
				+ "7 - Exit";

		int option = Integer.parseInt(JOptionPane.showInputDialog(m));
		if (option < 1 || option > 7) {
			JOptionPane.showMessageDialog(null, "Invalid option. Please choose between 1 and 7.");
            option = menu();
		}
		return option;
	}
	
	public static void logStudent(ArrayList<Student> students) {
		Student s = new Student();
		s.name = JOptionPane.showInputDialog("Enter Student's Name:");
		double grade = 0;
		
		do {
			grade = Double.parseDouble(JOptionPane.showInputDialog("Enter a Grade (-1 to Exit):"));
			s.grades.add(grade);
		} while (grade != -1);
		
		students.add(s);
	}
	
	public static String fullReport(ArrayList<Student> students) {
		String msg = "FULL REPORT\n";
		
		for (Student s : students) {
			msg += s.name + ": " + calculateAvg(s.grades) + " (" + verifySituation(s) + ")\n";
		}
		
		return msg;
	}
	
	public static double calculateAvg(ArrayList<Double> grades) {
		double sum = 0;
		for (Double grade : grades) {
			sum += grade;
		}
		return sum / grades.size();
	}
	
	public static String verifySituation(Student s) {
		if (calculateAvg(s.grades) >= 7) {
			return "Approved";
		} else {
			if (calculateAvg(s.grades) < 3) {
				return "Failed";
			}
		}
		return "Rework";
	}

}

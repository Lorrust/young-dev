package basic.methods;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExampleClass {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		register(students);
		register(students);
		register(students);
		
		JOptionPane.showMessageDialog(null, verifyCondition(students.get(0)));
		JOptionPane.showMessageDialog(null, verifyCondition(students.get(1)));
		JOptionPane.showMessageDialog(null, verifyCondition(students.get(2)));
		
		verifyCondition(students.get(0));
		verifyCondition(students.get(1));
		verifyCondition(students.get(2));
		
	}
	
//	Register Student (Name and Grade(s))
	public static void register(ArrayList<Student> students) {
		Student s = new Student();
		s.name = JOptionPane.showInputDialog("Student's Name:");
		double grade = 0;
		
		do {
			grade = Double.parseDouble(JOptionPane.showInputDialog("Grade (-1 to Exit):"));
			s.grades.add(grade);
		} while (grade != -1);
		
		students.add(s);
	}
	
//	Calculate Average of Grades
	public static double calculateAvg(ArrayList<Double> grades) {
		double sum = 0;
		for (Double grade : grades) {
			sum += grade;
		}
		return sum / grades.size();
	}
	
	public static String verifyCondition(Student s) {
		double avg = calculateAvg(s.grades);
		if (avg >= 7) {
			return s.name + ": APPROVED";
		} else {
			if (avg < 3) {
				return s.name + ": FAILED";
			}
		}
		return s+ ": REWORK";
	}
	
	public static Student highestAvg(ArrayList<Student> students) {
		Student topStudent = students.get(0);
		double topAvg = calculateAvg(topStudent.grades);
		for (Student s : students) {
			double avgStudentList = calculateAvg(s.grades);
			if (avgStudentList > topAvg) {
				topAvg = avgStudentList;
				topStudent = s;
				
			}
		}
		return topStudent;
	}

}

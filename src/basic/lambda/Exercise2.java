package basic.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		String[] names = { "Juniper", "Almond", "Aksar", "Lupus", "Ulgran" };
		Integer[] rollCalls = { 3, 1, 2, 4, 5 };
		String[] birthDates = { "23/07/2010", "05/06/2004", "11/04/2001", "15/09/2005", "17/09/1771" };

		for (int i = 0; i < 5; i++) {
			Student student = new Student();
			student.setName(names[i]);
			student.setRollCall(rollCalls[i]);
			student.setBirthDate(LocalDate.parse(birthDates[i], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			students.add(student);
		}

		Comparator<Student> byBirthDate = Comparator.comparing(Student::getBirthDate);
		students.sort(byBirthDate);

		students.forEach(System.out::println);

	}

}

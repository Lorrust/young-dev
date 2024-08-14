
package basic.oop.exercise6;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	static ArrayList<Person> people = new ArrayList<Person>();

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "Yor";
		p.dateOfBirth = LocalDate.of(2008, 1, 5);
		people.add(p);

		Individual pf = new Individual();
		pf.name = "Reginald";
		pf.dateOfBirth = LocalDate.of(2010, 10, 11);
		pf.socialNumber = "002.184.048-70";
		people.add(pf);

		Person youngestPerson = findYoungestPerson(people);

		String result = "Youngest Person: " + youngestPerson.name + "\nDate of Birth: " + youngestPerson.dateOfBirth;

		if (youngestPerson.getClass().equals(Individual.class)) {
			result += "\nCPF: " + Individual.class.cast(youngestPerson).socialNumber;
		}

		JOptionPane.showMessageDialog(null, result);

	}

	public static Person findYoungestPerson(ArrayList<Person> people) {
		Person youngestPerson = people.get(0);
		for (int i = 1; i < people.size(); i++) {
			if (people.get(i).dateOfBirth.isAfter(youngestPerson.dateOfBirth)) {
				youngestPerson = people.get(i);
			}
		}
		return youngestPerson;
	}
}

package basic.oop.exercise5;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    
    static ArrayList<Person> people = new ArrayList<Person>();

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Edward";
        person1.dateOfBirth = LocalDate.of(2010, 10, 15);
        people.add(person1);

        Person person2 = new Person();
        person2.name = "Mary";
        person2.dateOfBirth = LocalDate.of(2007, 11, 20);
        people.add(person2);
        
        Person oldestPerson = findOldestPerson(people);
        
        JOptionPane.showMessageDialog(null, "Oldest Person: " + oldestPerson.name + "\nBirth Date: " + oldestPerson.dateOfBirth);

    }

    public static Person findOldestPerson(ArrayList<Person> people) {
        Person oldestPerson = people.get(0);
        for (int i = 1; i < people.size(); i++) {
            if (people.get(i).dateOfBirth.isBefore(oldestPerson.dateOfBirth)) {
                oldestPerson = people.get(i);
            }
        }
        return oldestPerson;
    }
}

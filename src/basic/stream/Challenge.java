package basic.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		String[] names = { "Yuri", "Ainstein", "Jihn", "Garona", "James", "Vedzinsky", "Ulfric", "Quelton", "Zoey",
				"Connor" };
		String[] phoneNumbers = { "4419832019", "2472619550", "1645339987", "5547190965", "4318790090", "1588978801",
				"6473235893", "6556718950", "1123365728", "1003590870" };
		String[] birthDates = { "2020-10-01", "2003-05-11", "1999-11-29", "2000-08-14", "2007-10-17", "1996-05-09",
				"2009-03-12", "1789-01-06", "2003-05-10", "2001-11-23" };

		for (int i = 0; i < names.length; i++) {
			Person p = new Person();
			p.setName(names[i]);
			p.setPhoneNumber(phoneNumbers[i]);
			p.setBirthDate(LocalDate.parse(birthDates[i], DateTimeFormatter.ISO_DATE));
			people.add(p);
		}

		for (Person p : people) {
			System.out.println(p.toString());
		}

		String result = people
						.stream().filter(p -> p.getBirthDate()
						.isLeapYear() || startsWithVowel(p.getName()))
						.sorted(Comparator.comparing(Person::getName)
						.reversed())
						.map(Person::getName)
						.collect(Collectors.joining("; "));
		
		System.out.println(result);
	}

	private static boolean startsWithVowel(String s) {
		s = s.toLowerCase();
		return Stream.of("a", "e", "i", "o", "u").anyMatch(s::startsWith);
		
	}

}

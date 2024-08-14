package basic.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		String[] names = {"Yuri", "Stein", "Jihn", "Garona", "James", "Vedzinsky", "Ulfric", "Quelton", "Zoey", "Connor"};
		String[] phoneNumbers = {"4419832019", "2472619550", "1645339987", "5547190965", "4318790090", "1588978801", "6473235893", "6556718950", "1123365728", "1003590870"};
		String[] birthDates = {"2020-10-01", "2003-05-11", "1999-11-29", "2000-08-14", "2007-10-17", "1996-05-09", "2009-03-12", "1789-01-06", "2003-05-10", "2001-11-23"};
		
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
		
		people.stream().filter(p -> p.getBirthDate().getMonthValue() == 5).forEach(p -> System.out.println(p.getName()));
	}

}

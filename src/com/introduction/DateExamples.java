package com.introduction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExamples {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date currentDate = new Date();

		System.out.println(currentDate);
		System.out.println(df.format(currentDate));

		String birthString = "20/02/1976";
		Date birthDate;

		try {
			birthDate = df.parse(birthString);
			System.out.println(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();

		}

		Calendar currentCal = Calendar.getInstance();
		currentCal.setTime(currentDate);
		currentCal.add(Calendar.DAY_OF_MONTH, 83);

		System.out.println(df.format(currentDate.getTime()));
		

	}

}

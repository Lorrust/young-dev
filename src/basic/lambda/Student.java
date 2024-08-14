package basic.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

	private String name;
	private int rollCall;
	private LocalDate dateOfBirth;

	@Override
	public String toString() {
		return "Name: " + name + " | Roll Call: " + rollCall + " | Date of Birth: " + dateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyy"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollCall() {
		return rollCall;
	}

	public void setRollCall(int rollCall) {
		this.rollCall = rollCall;
	}

	public LocalDate getBirthDate() {
		return dateOfBirth;
	}

	public void setBirthDate(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}

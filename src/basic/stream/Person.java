package basic.stream;

import java.time.LocalDate;

public class Person {

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth + "]";
	}

	String name;
	String phoneNumber;
	LocalDate dateOfBirth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getBirthDate() {
		return dateOfBirth;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.dateOfBirth = birthDate;
	}

}

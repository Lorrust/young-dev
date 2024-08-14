package basic.arrays.practice;

import javax.swing.JOptionPane;

public class ContactList {

	public static void main(String[] args) {

		String[] names = new String[100];
		int[] contacts = new int[100];

		String menu = "1 - Create Contact\n" + "2 - Search by Name\n" + "3 - Search by Number\n" + "4 - Exit";

		int option = 0;
		int counter;
		
//		TEST START
		
		names[0] = "John";
		names[1] = "Travis";
		names[2] = "Mark";
		names[3] = "Larry";
		names[4] = "Frank";
		names[5] = "Parker";
		
		contacts[0] = 1495733;
		contacts[1] = 5977314;
		contacts[2] = 9093153;
		contacts[3] = 6768101;
		contacts[4] = 5912330;
		contacts[5] = 6901423;
		
		counter = 6;
		
//		TEST END

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (option) {

			case 1:
				if (counter < 100) {
					names[counter] = JOptionPane.showInputDialog("Enter the name:");
					contacts[counter] = Integer.parseInt(JOptionPane.showInputDialog("Enter the contact number:"));
					counter++;
					JOptionPane.showMessageDialog(null, "Contact created successfully.");
				}
				break;
			case 2:
				String searchName = JOptionPane.showInputDialog("Enter the name:");
				String foundName = "Name not found.";
				
				int namePos = 0;
				
				do {
					if (names[namePos].equals(searchName)) {
						foundName = names[namePos];
						JOptionPane.showMessageDialog(null, foundName + ": " + contacts[namePos]);
					}
					namePos++;

				} while (namePos < counter && foundName.equals("Name not found."));
				break;
			case 3:
				String searchNumber = JOptionPane.showInputDialog("Enter the contact:");
				String foundNumber = "Contact not found.";
				
				int numberPos = 0;
				
				do {
					if (names[numberPos].equals(searchNumber)) {
						foundNumber = names[numberPos];
						JOptionPane.showMessageDialog(null, names[numberPos] + ": " + foundNumber);
					}
					numberPos++;

				} while (numberPos < counter && foundNumber.equals("Contact not found."));
				break;
			case 4:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid option.");
			}

		} while (option != 4);

	}

}

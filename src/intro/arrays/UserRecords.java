package intro.arrays;

import javax.swing.JOptionPane;

public class UserRecords {

	public static void main(String[] args) {

		String menu = "1- Register" + "\n2 - Oldest User" + "\n3 - Search User" + "\n9 - Exit";

		int option = 0;
		String[] names = new String[100];
		int[] ages = new int[100];
		int counter = 0;

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (option) {
			case 1:
				if (counter < 100) {
					names[counter] = JOptionPane.showInputDialog("Name " + (counter + 1));
					ages[counter] = Integer.parseInt(JOptionPane.showInputDialog("Age " + (counter + 1)));
					counter++;
				} else {
					JOptionPane.showMessageDialog(null, "Memory Full");
				}
				break;
			case 2:
				String oldestName = names[0];
				int oldestAge = ages[0];

				for (int i = 1; i < counter; i++) {
					if (ages[i] > oldestAge) {
						oldestAge = ages[i];
						oldestName = names[i];
					}
				}
				JOptionPane.showMessageDialog(null, "Oldest User: " + oldestName + "\nAge: " + oldestAge);
				break;
			case 3:
				String searchName = JOptionPane.showInputDialog("Search by Name:");
				String foundName = "Name not Found";
				int pos = 0;

				do {
					if (names[pos].equals(searchName)) {
						foundName = names[pos];
						JOptionPane.showMessageDialog(null, "Found " + foundName + " on position " + pos + ".");
					}
					pos++;

				} while (pos < counter && foundName.equals("Name not Found"));

				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid option.");
			}

		} while (option != 9);

	}

}

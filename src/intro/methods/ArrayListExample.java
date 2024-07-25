package intro.methods;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        int option;

        do {
            option = menu();

            switch (option) {
                case 1:
                    register(names);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, listAll(names));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, filterByName(names));
                    break;
            }
        } while (option != 4);

        JOptionPane.showMessageDialog(null, "Exiting program. Goodbye!");
    }

    public static int menu() {
        String m = "1 - Register\n" + "2 - List All\n" + "3 - Search by Name\n" + "4 - Exit";

        int option = 0;

        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(m));
            if (option < 1 || option > 4) {
                JOptionPane.showMessageDialog(null, "Invalid option. Please choose between 1 and 4.");
                option = menu(); // Recursive call to handle invalid input
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 4.");
            option = menu(); // Recursive call to handle invalid input
        }

        return option;
    }

    public static void register(ArrayList<String> list) {
        String name = JOptionPane.showInputDialog("Enter name:");
        list.add(name);
    }

    public static String listAll(ArrayList<String> list) {
        StringBuilder ret = new StringBuilder("Registered Names\n");
        for (String name : list) {
            ret.append(name).append("\n");
        }
        return ret.toString();
    }

    public static String filterByName(ArrayList<String> list) {
        String nameSearch = JOptionPane.showInputDialog("Enter the name to search:");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.equals(nameSearch)) {
                return name + " found at position " + (i + 1);
            }
        }
        return "Name not found";
    }
}

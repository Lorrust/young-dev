package com.repetition_structure;

import javax.swing.JOptionPane;

public class MenuExample {

	public static void main(String[] args) {

		String menu = "1. Spaghetti Bolognese\n" +
					  "2. Chicken Caesar Salad\n" +
					  "3. Beef Burger with French Fries\n" +
					  "4. Margherita Pizza\n" +
					  "5. Grilled Chicken Sandwich\n\n" +
					  "6. Close Menu";

		String order = "";

		int option = 6;
		
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (option) {
			case 1:
				order += "Spaghetti Bolognese\n";
			break;
			case 2:
				order += "Chicken Caesar Salad\n";
				break;
			case 3:
				order += "Beef Burger with French Fries\n";
				break;
			case 4:
				order += "Margherita Pizza\n";
				break;
			case 5:
				order += "Grilled Chicken Sandwich\n";
				break;
			case 6:
				if (order.equals("")) {
					order = "Empty order.";
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid option.");
				
				break;
			}
			
		} while (option != 6);
		
		JOptionPane.showMessageDialog(null, order);

	}
}
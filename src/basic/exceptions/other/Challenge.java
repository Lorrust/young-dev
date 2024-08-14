package basic.exceptions.other;

import javax.swing.JOptionPane;

public class Challenge {

	public static void main(String[] args) {

		Sale s = new Sale();

		s.setClientName(JOptionPane.showInputDialog("Enter the client's name:"));
		
		int itemsAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of items:"));

		try {
			if (itemsAmount < 1 || itemsAmount > 10) {
				throw new SaleException();

			}

			for (int i = 0; i < itemsAmount; i++) {
				Item item = new Item();
				item.name = JOptionPane.showInputDialog("Enter the name of item " + (i + 1) + ":");

				do {

					item.price = Double
							.parseDouble(JOptionPane.showInputDialog("Enter the price of " + item.name + ":"));

					try {
						if (item.price <= 0) {
							throw new IncorrectPriceException();
						}
					} catch (IncorrectPriceException e) {
						JOptionPane.showMessageDialog(null, "Price must be greater than 0.");
					}
				} while (item.price <= 0);
				
				s.getSale().add(item);
				
			}

		} catch (SaleException e) {
			JOptionPane.showMessageDialog(null, "Amount of items must be between 1 and 10.");
		}
		
	}
}
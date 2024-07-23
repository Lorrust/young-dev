package intro.arrays.practice;

import javax.swing.JOptionPane;

public class MarketStock {

	public static void main(String[] args) {

		String[] stockAmounts = new String[50];
		double[] stockPrices = new double[50];

		String menu = "1 - Add Product\n" + "2 - View Stock\n" + "3 - Exit";

		int option = 0;
		int counter = 0;

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (option) {
			case 1:
				if (counter < 50) {
					stockAmounts[counter] = JOptionPane.showInputDialog("Item " + (counter + 1) + " Amount:");
					stockPrices[counter] = Double
							.parseDouble(JOptionPane.showInputDialog("Item " + (counter + 1) + " Price:"));
					counter++;
				}
				break;
			case 2:
				if (counter > 0) {
					for (int i = 0; i < counter; i++) {
						JOptionPane.showMessageDialog(null,
								"Item " + (i + 1) + ": " + stockAmounts[i] + " Units" + "\nPrice: $" + stockPrices[i]);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Empty Stock!");
				}
				break;
			}

		} while (option != 3);

	}

}

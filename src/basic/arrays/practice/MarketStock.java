package basic.arrays.practice;

import javax.swing.JOptionPane;

public class MarketStock {

	public static void main(String[] args) {

		String[] stockItems = new String[50];
		int[] stockAmounts = new int[50];
		double[] stockPrices = new double[50];

		String menu = "1 - Add Product\n" + "2 - View Stock\n" + "3 - Stock Report\n" + "9 - Exit";

		int option = 0;
		int counter = 0;

//		TEST START

		stockItems[0] = "Rice";
		stockItems[1] = "Potato";
		stockItems[2] = "Milk";
		stockItems[3] = "Coffee";
		stockItems[4] = "Apple";
		stockItems[5] = "Mango";

		stockAmounts[0] = 50;
		stockAmounts[1] = 0;
		stockAmounts[2] = 3;
		stockAmounts[3] = 20;
		stockAmounts[4] = 0;
		stockAmounts[5] = 35;

		stockPrices[0] = 5;
		stockPrices[1] = 2;
		stockPrices[2] = 7;
		stockPrices[3] = 10;
		stockPrices[4] = 3;
		stockPrices[5] = 4;

		counter = 6;

//		TEST END

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (option) {
			case 1:
				if (counter < 50) {
					stockItems[counter] = JOptionPane.showInputDialog("Item " + (counter + 1) + " Name:");
					stockAmounts[counter] = Integer
							.parseInt(JOptionPane.showInputDialog("Item " + (counter + 1) + " Amount:"));
					stockPrices[counter] = Double
							.parseDouble(JOptionPane.showInputDialog("Item " + (counter + 1) + " Price:"));
					counter++;
				}
				break;
			case 2:
				if (counter > 0) {
					for (int i = 0; i < counter; i++) {
						JOptionPane.showMessageDialog(null,
								stockItems[i] + ": " + stockAmounts[i] + " Units" + "\nPrice: $" + stockPrices[i]);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Empty Stock!");
				}
				break;
			case 3:
				int lowStock = 0;
				for (int i = 0; i < counter; i++) {
					if (stockAmounts[i] < 10) {
						lowStock++;
					}
				}

				int goodStock = 0;
				for (int i = 0; i < counter; i++) {
					if (stockPrices[i] > 100 && stockAmounts[i] > 10) {
						goodStock++;
					}
				}

				int lowestAmount = stockAmounts[0];
				double lowestPrice = stockAmounts[0];
				String lowestItem = stockItems[0];
				for (int i = 1; i < counter; i++) {
					if (stockAmounts[i] < lowestAmount) {
						lowestPrice = stockAmounts[0];
						lowestAmount = stockAmounts[i];
						lowestItem = stockItems[i];
					}
				}

				double expensivePrice = stockPrices[0];
				int expensiveAmount = stockAmounts[0];
				String expensiveItem = stockItems[0];
				for (int i = 1; i < counter; i++) {
					if (stockPrices[i] > expensivePrice) {
						expensivePrice = stockPrices[i];
						expensiveAmount = stockAmounts[i];
						expensiveItem = stockItems[i];
					}
				}

				double noStock = 0;
				double noStockRate;
				for (int i = 0; i < counter; i++) {
					System.out.println(noStock);
					if (stockAmounts[i] == 0) {
						noStock++;
					}
				}
				noStockRate = Math.round(noStock / counter * 100);

				JOptionPane.showMessageDialog(null, "Products on Low Stock: " + lowStock + 
													"\nGood Products: " + goodStock +
													"\nLowest Stock: " + lowestItem + " (" + "$" + lowestPrice + ")"  +
													"\nMost Expensive: " + expensiveItem + " (" + expensiveAmount + " units)" +
													"\nNo Stock Percentage: " + noStockRate + "%");

			}

		} while (option != 9);

	}

}

package intro.exercises;

import javax.swing.JOptionPane;

public class BankOperations {

	public static void main(String[] args) {

		double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance:"));
		int operationsAmount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of operations:"));

		for (int i = 0; i < operationsAmount; i++) {

			char choice = JOptionPane.showInputDialog("Select the operation:\n" +
														"D - Deposit\n" +
														"W - Withdraw").charAt(0);

			switch (choice) {
			case 'D':
				balance += Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to deposit:"));
				break;
			case 'W':
				balance -= Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to withdraw:"));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid option.");
				break;
			}
		}

		JOptionPane.showMessageDialog(null, "Final balance: $" + balance);

	}

}

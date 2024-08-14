package basic.exams.exam1;

import javax.swing.JOptionPane;

public class DollarConversion {
	
	public static void main(String[] args) {
		
		double real = Double.parseDouble(JOptionPane.showInputDialog("Enter the value in R$ you want to convert:"));
		double exchangeRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the current exchange rate:"));
		
		JOptionPane.showMessageDialog(null, "R$" + real + " is equal to " + "$" + (real / exchangeRate));
		
	}

}

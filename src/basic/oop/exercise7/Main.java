package basic.oop.exercise7;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Invoice> invoices = new ArrayList<Invoice>();
		
		Invoice invoice1 = new Invoice();
		invoice1.setIssuer("Klein");
		invoice1.calculateAmount(4989.99, 250.49);
		invoices.add(invoice1);
				
		Invoice invoice2 = new Invoice();
		invoice2.setIssuer("Frederic");
		invoice2.calculateAmount(150.49, 49.40);
		invoices.add(invoice2);
				
		for (Invoice invoice : invoices) {
		    JOptionPane.showMessageDialog(null, "Issuer: " + invoice.getIssuer() + "\nAmount: R$" + invoice.getAmount());
		}

		
	}

}

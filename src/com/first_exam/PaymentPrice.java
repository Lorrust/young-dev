package com.first_exam;

import javax.swing.JOptionPane;

public class PaymentPrice {

	public static void main(String[] args) {

		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the purchase price in R$:"));
		int parcels = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of parcels:"));

		if (parcels == 1) {
			price *= 0.9;
		} else if (parcels > 3) {
			price *= 1.15;
		}
		
		JOptionPane.showMessageDialog(null, "The value of each parcel is R$" + String.format("%.2f", price / parcels));
		
	}
}

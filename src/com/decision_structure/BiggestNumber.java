package com.decision_structure;

import javax.swing.JOptionPane;

public class BiggestNumber {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number:"));

		if (num1 > num2 && num1 > num3) {
			JOptionPane.showMessageDialog(null, "The biggest number is the first one: " + num1);
		} else {
			if (num2 > num1 && num2 > num3) {
				JOptionPane.showMessageDialog(null, "The biggest number is the second one: " + num2);
			} else {
				if (num3 > num1 && num3 > num2) {
					JOptionPane.showMessageDialog(null, "The biggest number is the third one: " + num3);
				} else {
					JOptionPane.showMessageDialog(null,
							"Some of the highest numbers have the same value: " + num1 + ", " + num2 + ", " + num3 + ".");
				}
			}
		}
	}

}

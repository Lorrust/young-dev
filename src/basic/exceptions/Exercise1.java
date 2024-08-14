package basic.exceptions;

import javax.swing.JOptionPane;

public class Exercise1 {

	public static void main(String[] args) {

		boolean notInt = true;

		while (notInt) {
			try {
				int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
				JOptionPane.showMessageDialog(null, "Seu número é " + number);
				notInt = false;
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido");

			}
		}
	}
}
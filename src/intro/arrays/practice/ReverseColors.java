package intro.arrays.practice;

import javax.swing.JOptionPane;

public class ReverseColors {

	public static void main(String[] args) {

		int colorSize = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of colors:"));
		String[] colors = new String[colorSize];

		for (int i = 0; i < colorSize; i++) {
			colors[i] = JOptionPane.showInputDialog("Enter a color:");
		}

		String msg = "Colors in reverse order:";

		for (int i = colorSize - 1; i > -1; i--) {
			System.out.println(colors[i]);
			msg += "\n" + colors[i];
		}

		JOptionPane.showMessageDialog(null, msg);

	}

}
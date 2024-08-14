package basic.intro;

import javax.swing.JOptionPane;

public class TriangleArea {

	public static void main(String[] args) {

//		Triangle Area Calculator = Height * Width / 2

		double t_height = Double.parseDouble(JOptionPane.showInputDialog("Triangle Height:"));
		double t_width = Double.parseDouble(JOptionPane.showInputDialog("Triangle Width:"));

		JOptionPane.showMessageDialog(null, "The triangle area is " + Math.round((t_height * t_width / 2)));

	}

}

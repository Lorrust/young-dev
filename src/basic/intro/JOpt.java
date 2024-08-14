package basic.intro;

import javax.swing.JOptionPane;

public class JOpt {

	public static void main(String[] args) {
		
//		BMI via JOptionPane

		String name = JOptionPane.showInputDialog("Name:");

		double weight = Double.parseDouble(JOptionPane
				.showInputDialog("Weight:"));
		double height = Double.parseDouble(JOptionPane
				.showInputDialog("Height:"));
		double bmi = weight / (height * height);

		String msg = name + ", your BMI is " + Math.round(bmi);
		JOptionPane.showMessageDialog(null, msg);

	}
}

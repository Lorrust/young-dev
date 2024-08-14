package basic.repetition_structure;

import javax.swing.JOptionPane;

public class ForExample {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the starter number:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the final number:"));

		if (num1 < num2) {
			for (int i = num1; i < num2; i++) {
				System.out.println(i);
			}
		}
		
		for (int i = num2; i < num1; i++) {
			System.out.println(i);
		}
	}

}
